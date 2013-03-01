package com.ama.apps.starter.services;

import com.ama.apps.starter.model.User;

public interface UserService {
    User getUserById(Long id);
    User getUserByUserName(String userName);
    User createUser(User user);
}

