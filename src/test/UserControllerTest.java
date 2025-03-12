
package com.itsupport.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserControllerTest {

    @Test
    public void testLogin() {
        UserController userController = new UserController();
        String view = userController.showLoginForm();
        assertNotNull(view);
    }
}
