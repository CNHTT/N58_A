package com.extra.n58.dao;

import com.extra.n58.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Extra on 2017/9/18.
 * GitHub cnhttt@163.com
 * Work to SZFP
 */
@Repository
public interface UserDao {
    User selectUserByLogin(@Param("nameOrEmail")String nameOrEmail,@Param("password")String pass);
}
