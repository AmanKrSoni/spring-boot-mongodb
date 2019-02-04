package com.cvt.springbootmongodb.service;


import com.cvt.springbootmongodb.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getById(int id);
    public User save(User user);
    public User update(int id,User user);
    public void delete(int id);
}
