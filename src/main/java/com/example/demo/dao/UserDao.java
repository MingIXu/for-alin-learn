package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void save(User user){
//        jdbcTemplate.update("insert into user values()");
        jdbcTemplate.update("insert into user values(?, ?, ?, ?)", new Object[] {user.getId(), user.getAccount(), user.getName(), user.getBirthday()});
//        jdbcTemplate.update("insert into user (name) values(?)", user.getName());
    }
}
