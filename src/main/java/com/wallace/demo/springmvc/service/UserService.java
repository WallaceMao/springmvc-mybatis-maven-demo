package com.wallace.demo.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wallace.demo.springmvc.dao.UserDao;
import com.wallace.demo.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by  on 2017/7/15.Wallace
 */
public class UserService {
    @Autowired
    UserDao userDao;

    public String sayUserHello(String user){
        return "user " + user +" says: hello";
    }

    public String getUserList(){
        List<User> list = userDao.getUserList();
        System.out.println(JSON.toJSONString(list));
        return"userList";
    }
}
