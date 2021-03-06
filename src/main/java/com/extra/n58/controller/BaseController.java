package com.extra.n58.controller;

import com.extra.n58.model.response.ResponseObj;
import com.extra.n58.utils.DataUtils;
import com.extra.n58.utils.GsonUtils;
import org.apache.log4j.Logger;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
public class BaseController {
    protected Logger log = Logger.getLogger(BaseController.class);

    protected final static String DATE_FORMATE = "yyyy-MM-dd";


    /**
     * 返回数据
     * @param obj
     * @return json
     */
    public String responseResult(Object obj){
        ResponseObj<Object> resp = new ResponseObj<Object>();
        if (DataUtils.isEmpty(obj)){
            resp.setCode(ResponseObj.EMPUTY);
            resp.setMsg(ResponseObj.EMPUTY_STR);
        }else {
            resp.setCode(ResponseObj.OK);
            resp.setMsg(ResponseObj.OK_STR);
            resp.setData(obj);
        }
        log.info("system.out: "+new GsonUtils().toJson(resp));
        return new GsonUtils().toJson(resp);
    }
    /**
     * 返回数据
     * @param obj
     * @return json
     */
    public String responseSuccess(Object obj,String str){
        ResponseObj<Object>  resp = new ResponseObj<Object>();
        if (DataUtils.isEmpty(obj)){
            resp.setCode(ResponseObj.EMPUTY);
            resp.setMsg(ResponseObj.EMPUTY_STR);
        }else {
            resp.setCode(ResponseObj.OK);
            resp.setMsg(str);
            resp.setData(obj);
        }
        log.info("system.out: "+new GsonUtils().toJson(resp));
        return new GsonUtils().toJson(resp);
    }

    /**
     * 返回数据
     * @return json
     */
    public String responseSuccess(String str){
        ResponseObj<Object>  resp = new ResponseObj<Object>();
        resp.setCode(ResponseObj.OK);
        resp.setMsg(str);
        log.info("system.out: "+new GsonUtils().toJson(resp));
        return new GsonUtils().toJson(resp);
    }


    public String responseFail(String error){
        ResponseObj<String> resp = new ResponseObj<String>();
        resp.setMsg(error);
        resp.setCode(ResponseObj.FAILED);
        log.info("system.out: "+new GsonUtils().toJson(resp));
        return new GsonUtils().toJson(resp);
    }

}
