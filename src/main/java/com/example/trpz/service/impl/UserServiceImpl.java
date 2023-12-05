package com.example.trpz.service.impl;

import com.example.trpz.entity.User;
import com.example.trpz.repository.UserRepo;
import com.example.trpz.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void removeById(Long userId) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public List<User> getUsersById(List<Long> userIds) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }
}
