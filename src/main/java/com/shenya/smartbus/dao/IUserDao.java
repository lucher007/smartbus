package com.shenya.smartbus.dao;

import com.shenya.smartbus.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {

    /*
     * @param User
     * @return
     */
    public User findById(Integer id);

}
