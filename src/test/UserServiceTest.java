package com.itsupport.service;

import com.itsupport.model.User;
import com.itsupport.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAuthenticateUser() {
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("password");

        userRepository.save(user);
        boolean isAuthenticated = userService.authenticate(user);

        assertTrue(isAuthenticated);
    }
}
