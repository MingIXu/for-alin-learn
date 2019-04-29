package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User users = userMapper.getUserById("1");
        System.out.println(users);
    }
    @Autowired
    UserDao dao;
    @Test
    public void testUserDao(){
        User user = new User();
        user.setAccount("555");
        user.setBirthday("2019-02-06");
        user.setName("464");
        dao.save(user);
        System.out.println(user);
    }

}
