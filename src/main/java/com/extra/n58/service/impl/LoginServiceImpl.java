package com.extra.n58.service.impl;

import com.extra.n58.dao.UserDao;
import com.extra.n58.model.TransactionData;
import com.extra.n58.model.User;
import com.extra.n58.model.response.ResponsePage;
import com.extra.n58.service.LoginService;
import com.extra.n58.utils.BeanUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LoginServiceImpl  implements LoginService {
    @Resource
    private UserDao userDao;

    public User getUserInfo(String usernameOrEmail, String pwd) {
        return  userDao.selectUserByLogin(usernameOrEmail,pwd);
    }

    @Override
    public ResponsePage<TransactionData> queryByPageConsume(Integer pageNo, Integer pageSize, Long adminId) {
        pageNo      = pageNo ==null?1:pageNo;
        pageSize    = pageSize ==null?1 :pageSize;
        PageHelper.startPage(pageNo,pageSize);
        return BeanUtils.toResponseResult(userDao.selectConsumeList(adminId));
    }

    @Override
    public ResponsePage<TransactionData> queryByPageRepeal(Integer pageNo, Integer pageSize, Long adminId) {
        pageNo      = pageNo ==null?1:pageNo;
        pageSize    = pageSize ==null?1 :pageSize;
        PageHelper.startPage(pageNo,pageSize);
        return BeanUtils.toResponseResult(userDao.selectRepealList(adminId));
    }

    @Override
    public boolean addTransactionData(TransactionData transactionData) {
        if (userDao.insterTranszction(transactionData)==0)return false;
        return true;
    }
}
