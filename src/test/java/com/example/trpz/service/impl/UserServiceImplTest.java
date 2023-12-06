package com.example.trpz.service.impl;

import com.example.trpz.entity.User;
import com.example.trpz.entity.Worker;
import com.example.trpz.repository.UserRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class UserServiceImplTest {
    @Mock
    private UserRepo userRepo;

    @InjectMocks
    private UserServiceImpl userService;
    @Test
    void removeById() {
        Long userId = 1L;
        userService.removeById(userId);
        verify(userRepo, times(1)).deleteById(userId);
    }

    @Test
    void save() {
        User user = new Worker();
        userService.save(user);
        verify(userRepo, times(1)).save(user);
    }

    @Test
    void editRoleForUser() {
        User user = new Worker();
        String role = "ROLE_ADMIN";
        userService.editRoleForUser(user, role);
        verify(userRepo, times(1)).save(user);
        assertEquals(role, user.getRole());
    }

    @Test
    void getUsersById() {
        List<Long> userIds = List.of(1L, 2L, 3L);
        when(userRepo.findById(any())).thenReturn(java.util.Optional.of(new Worker()));
        List<User> users = userService.getUsersById(userIds);
        assertEquals(userIds.size(), users.size());
    }

    @Test
    void getUserById() {
        Long userId = 1L;
        when(userRepo.findById(userId)).thenReturn(java.util.Optional.of(new Worker()));
        User user = userService.getUserById(userId);
        assertNotNull(user);
    }
}