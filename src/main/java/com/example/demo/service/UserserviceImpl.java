package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserserviceImpl implements UsersService{
    @Autowired
    private UserDao dao;
    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void delect(User user) {

    }
}
