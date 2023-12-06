package com.example.trpz.service;

import com.example.trpz.entity.User;

import java.util.List;

public interface UserService {
    void removeById(Long userId);
    void save(User user);
    void editRoleForUser(User user, String role);
    List<User> getUsersById(List<Long> userIds);
    User getUserById(Long userId);

}
