package com.elijahjorell.projectportfoliobackend.services;

import com.elijahjorell.projectportfoliobackend.models.User;
import com.elijahjorell.projectportfoliobackend.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User save(User user) {
        return userRepo.save(user);
    }

    public User findByUsername(String username) {
        Optional<User> foundUser =userRepo.findFirstByUsernameIgnoreCase(username);
        return foundUser.orElse(null);
    }



}
