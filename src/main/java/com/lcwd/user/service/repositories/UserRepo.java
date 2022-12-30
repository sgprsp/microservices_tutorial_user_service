package com.lcwd.user.service.repositories;

import com.lcwd.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
