package com.mirza.demo.service;

import com.mirza.demo.entity.User;
import com.mirza.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mirzbeg
 **/
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return  userRepository.save(user);
    }
}
