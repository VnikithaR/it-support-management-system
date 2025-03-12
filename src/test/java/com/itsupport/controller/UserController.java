package com.itsupport.controller;

import com.itsupport.model.User;
import com.itsupport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model) {
        if (userService.authenticate(user)) {
            model.addAttribute("user", user);
            return "dashboard";
        }
        model.addAttribute("error", "Invalid credentials");
        return "login";
    }

    // Additional user-related methods like register, update
