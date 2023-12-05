package com.example.trpz.service;

import com.example.trpz.entity.User;

import java.util.List;

public interface UserService {
    void removeById(Long userId);
    void save(User user);
    List<User> getUsersById(List<Long> userIds);
    User getUserById(Long userId);
}
