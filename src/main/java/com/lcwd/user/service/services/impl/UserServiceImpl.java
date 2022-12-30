package com.lcwd.user.service.services.impl;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.repositories.UserRepo;
import com.lcwd.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User with given id is not found!!" + userId));
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(String userId) {
        userRepo.deleteById(userId);
    }
}
