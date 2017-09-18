package com.extra.n58.service.impl;

import com.extra.n58.dao.UserDao;
import com.extra.n58.model.User;
import com.extra.n58.service.LoginService;
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
}
