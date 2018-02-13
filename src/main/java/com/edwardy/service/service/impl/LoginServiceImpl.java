package com.edwardy.service.service.impl;

import com.edwardy.dao.LoginDao;
import com.edwardy.dao.impl.LoginDaoImpl;
import com.edwardy.po.User;
import com.edwardy.service.LoginService;

/**
 * Created by yuminghua on 2/12/18.
 */
public class LoginServiceImpl implements LoginService{
    @Override
    public User LoginService(String userName, String passWord) {
        LoginDao loginDao = new LoginDaoImpl();
        return loginDao.login(userName,passWord);
    }
}
