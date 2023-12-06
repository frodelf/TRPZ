package com.example.trpz.validator;

import com.example.trpz.entity.User;
import com.example.trpz.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataValidator {
    private final UserServiceImpl userService;
    private boolean validUserNameAndPassword(User user) {
        User validUser = userService.getUserById(user.getId());
        return user.getUsername().equals(validUser.getUsername()) && user.getPassword().equals(validUser.getPassword());
    }
    private boolean validRoles(User user) {
        User validUser = userService.getUserById(user.getId());
        return user.getRole().equals(validUser.getRole());
    }
    public boolean validUser(User user) {
        if(validUserNameAndPassword(user)){
            return validRoles(user);
        }
        return false;
    }
}
