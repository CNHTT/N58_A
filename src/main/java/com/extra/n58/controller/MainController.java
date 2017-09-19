package com.extra.n58.controller;

import com.extra.n58.model.DataBean;
import com.extra.n58.model.TransactionData;
import com.extra.n58.model.User;
import com.extra.n58.model.response.ResponseObj;
import com.extra.n58.model.response.ResponsePage;
import com.extra.n58.service.LoginService;
import com.extra.n58.utils.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.extra.n58.utils.DataUtils.isNullString;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
@Controller
public class MainController extends BaseController {

    private Logger log = Logger.getLogger(MainController.class);

    @Resource
    private LoginService loginService;

    @RequestMapping("/login")
    private  String login(){
        return "login";
    }

    @RequestMapping("/consume")
    private  String consume(){
        return "index";
    }
    @RequestMapping("/repeal")
    private  String repeal(){
        return "repeal";
    }

    @RequestMapping(value = "consume.mp")
    @ResponseBody
    public String getAllConsumeList(Long adminId,Integer pageNumber, Integer pageSize){
        log.info("分页查询consume信息"+pageNumber +" , "+pageSize);
        try {
            ResponsePage<TransactionData> responsePage = loginService.queryByPageConsume(pageNumber,pageSize,adminId);
            return responseResult(responsePage);
        }catch (Exception e){
            return   responseFail(e.toString());
        }
    }
 @RequestMapping(value = "repeal.mp")
    @ResponseBody
    public String getAllRepealList(Long adminId,Integer pageNumber, Integer pageSize){
        log.info("分页查询Repeal信息"+pageNumber +" , "+pageSize);
        try {
            ResponsePage<TransactionData> responsePage = loginService.queryByPageRepeal(pageNumber,pageSize,adminId);
            return responseResult(responsePage);
        }catch (Exception e){
            return   responseFail(e.toString());
        }
    }


    @RequestMapping("/singout")
    private  String singOut(HttpSession session){
        session.setAttribute("id",null);
        session.setAttribute(SessionUtils.SESSION_ADMIN_USER,null);
        return "redirect:login";
    }


    @RequestMapping(value = "postTran.mp")
    @ResponseBody
    public String postReportHistory(String data){
        if (isNullString(data)) return responseFail("Request data cannot be empty");
        log.info("post transaction  " +data);
        DataBean dataBean = new GsonUtils().fromJson(data,DataBean.class);
        if (loginService.addTransactionData(dataBean.getData())){
            return responseSuccess("success");
        }else {
            return responseFail("submit failure");
        }

    }



    @RequestMapping(value = "/singin" )
    private String userLogin(String username, ModelMap model, String password, HttpServletRequest req, HttpSession sessions){
        User user =null;
        ResponseObj<User> responseObj = new ResponseObj<User>();

        String cookies = req.getCookies()[0].getValue();
        log.info(cookies  +"              ");

        if (!isNullString(username)&& RegexUtils.isCheckPassWord(password))
            user = loginService.getUserInfo(username, MD5Util.string2MD5(password));

        else {
            responseObj.setCode(ResponseObj.FAILED);
            responseObj.setMsg(ResponseObj.FAILED_STR);
            responseObj.setMsg("Please input UserNameOrEmail  PassWord!");
            req.setAttribute("data",new GsonUtils().toJson(responseObj));
            return "forward:login";
        }

        if (DataUtils.isEmpty(user)){
            responseObj.setCode(ResponseObj.EMPUTY);
            responseObj.setMsg("The user does not exist! Please check the");
            req.setAttribute("username",username);
            req.setAttribute("pwd",password);
            req.setAttribute("error",new GsonUtils().toJson(responseObj));
            return "forward:login";
        }else {

            user.setUserPwd(req.getSession().getId());
            responseObj.setData(user);
            responseObj.setCode(ResponseObj.OK);
            responseObj.setMsg("登录成功");
            req.setAttribute("user",user.getUserName());
            sessions.setAttribute("id",user.getId());
            sessions.setAttribute(SessionUtils.SESSION_ADMIN_USER,new GsonUtils().toJson(user));
            return "redirect:index";
        }
    }
    @RequestMapping("/index")
    public String Home()
    {
        return "index";
    }
}
