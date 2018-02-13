package com.edwardy.dao;

import com.edwardy.po.User;

/**
 * Created by yuminghua on 2/12/18.
 */
public interface LoginDao {
    public User login(String name,String passWord);
}
