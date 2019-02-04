package com.cvt.springbootmongodb.dao;

import com.cvt.springbootmongodb.model.User;
import com.cvt.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        Optional<User> op=userRepository.findById(id);
        User user=op.get();
        return user;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
