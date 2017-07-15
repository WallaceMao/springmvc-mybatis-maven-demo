package com.wallace.demo.springmvc.dao;

import com.wallace.demo.springmvc.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by  on 2017/6/21.Wallace
 */
@Repository("userDao")
public interface UserDao {

    public long saveUser(User user);

    public long deleteUser(User user);

    public long updateUser(User user);

    public List<User> getUserList();

    public User getUserById(long id);
}
