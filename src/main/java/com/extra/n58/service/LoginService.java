package com.extra.n58.service;

import com.extra.n58.model.User;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
public interface LoginService {
    User getUserInfo(String usernameOremail, String pwd);
}
