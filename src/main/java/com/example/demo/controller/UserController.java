package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserserviceImpl userservice;

   @RequestMapping("/save")
    private String save(long id,String account,String name,String birthday){
       User user = new User();
       user.setId(id);
       user.setAccount(account);
       user.setName(name);
       user.setBirthday(birthday);
       userservice.save(user);
       return "save successfully";
   }

//    @Autowired
//    UserMapper userMapper;
//    @GetMapping("list")
//    public Object userList(String keyWord){
//        System.out.println(keyWord);
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        if (!StringUtils.isEmpty(keyWord)){
//            queryWrapper.like("name",keyWord);
//        }
//        List<User> users = userMapper.selectList(queryWrapper);
//        return users;
//    }
}
