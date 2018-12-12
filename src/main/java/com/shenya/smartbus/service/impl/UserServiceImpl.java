package com.shenya.smartbus.service.impl;

import com.shenya.smartbus.dao.IUserDao;
import com.shenya.smartbus.model.User;
import com.shenya.smartbus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User findById(Integer id) {
        return userDao.findById(id);
    }

}
