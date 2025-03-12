package com.itsupport.service;

import com.itsupport.model.User;
import com.itsupport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());
        return existingUser != null && existingUser.getPassword().equals(user.getPassword());
    }

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
