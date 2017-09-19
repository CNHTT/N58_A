package com.extra.n58.service;

import com.extra.n58.model.TransactionData;
import com.extra.n58.model.User;
import com.extra.n58.model.response.ResponsePage;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
public interface LoginService {
    User getUserInfo(String usernameOremail, String pwd);

    ResponsePage<TransactionData> queryByPageConsume(Integer pageNumber, Integer pageSize, Long adminId);

    ResponsePage<TransactionData> queryByPageRepeal(Integer pageNumber, Integer pageSize, Long adminId);

    boolean addTransactionData(TransactionData transactionData);
}
