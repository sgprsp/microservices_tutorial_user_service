package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);

    User updateUser(User user);

    void deleteUser(String userId);

}
