package com.example.trpz.service.impl;

import com.example.trpz.entity.User;
import com.example.trpz.repository.UserRepo;
import com.example.trpz.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void removeById(Long userId) {
        userRepo.deleteById(userId);
    }

    @Override
    @Transactional
    public void save(User user) {
        userRepo.save(user);
    }

    @Override
    public void editRoleForUser(User user, String role) {
        user.setRole(role);
        save(user);
    }

    @Override
    public List<User> getUsersById(List<Long> userIds) {
        List<User> users = new ArrayList<>();
        for (Long userId : userIds) {
            users.add(userRepo.findById(userId).orElseThrow(() -> new EntityNotFoundException("User with id="+userId+" was not found")));
        }
        return users;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepo.findById(userId).orElseThrow(() -> new EntityNotFoundException("User with id="+userId+" was not found"));
    }
}
