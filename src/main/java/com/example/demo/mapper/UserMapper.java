package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where id = #{id}")
    public User getUserById(@Param("id") String id);

    @Insert("insert into user(account,name,birthday) values(#{account}, #{name}, #{birthday})")
    public User save(@Param("account") String account,
                     @Param("name") String name,
                     @Param("birthday") String birthday);
}
