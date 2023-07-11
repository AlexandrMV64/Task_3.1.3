package com.myasnikov.springbood.crud.spring_boot_crud.service;

import com.myasnikov.springbood.crud.spring_boot_crud.repository.UserRepository;
import com.myasnikov.springbood.crud.spring_boot_crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getOne(id);
    }
}