package com.ambrose.helpdesk.service;

import com.ambrose.helpdesk.model.User;

public interface UserService {

    User findUserByEmail(String email);

    boolean findRoleByUser(String role, User user);

    boolean isAdmin(User user);

    boolean isUser(User user);

    void saveUser(User user);

}
