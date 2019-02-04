package com.cvt.springbootmongodb.dao;

import com.cvt.springbootmongodb.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    public List<User> getAll();
    public User getById(int id);
    public User save(User user);
    public void delete(int id);

}
