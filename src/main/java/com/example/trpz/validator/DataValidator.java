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
        return true;
    }
    private boolean validRoles(User user) {
        return false;
    }
    public boolean validUser(User user) {
        return true;
    }
}
