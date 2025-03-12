package com.itsupport.controller;

import com.itsupport.model.User;
import com.itsupport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "admin_dashboard";
    }

    // Additional methods for managing users and tickets
}
