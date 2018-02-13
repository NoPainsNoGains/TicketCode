package com.edwardy.dao.impl;

import com.edwardy.dao.LoginDao;
import com.edwardy.po.User;

/**
 * Created by yuminghua on 2/12/18.
 */
public class LoginDaoImpl implements LoginDao{
    @Override
    public User login(String name, String passWord) {
        User user = new User();
        user.setName("YMH");
        user.setTelPhone("18180931263");
        return user;
    }
}
