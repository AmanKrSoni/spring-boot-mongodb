package com.cvt.springbootmongodb.service;


import com.cvt.springbootmongodb.dao.UserDao;
import com.cvt.springbootmongodb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User update(int id, User user) {
        User u=userDao.getById(id);
        if(u==null)
            throw new RuntimeException("USER_NOT_FOUND Id : "+id);
        u.setName(user.getName());
        u.setSalary(user.getSalary());
        u.setTeamName(user.getTeamName());
        return userDao.save(u);
    }

    @Override
    public void delete(int id) {
        User user=userDao.getById(id);
        if(user==null)
            throw new RuntimeException("USER_NOT_FOUND Id : "+id);
        userDao.delete(id);
    }
}
