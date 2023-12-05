package com.example.trpz.service.impl;

import com.example.trpz.entity.TimeRegister;
import com.example.trpz.entity.User;
import com.example.trpz.repository.TimeRegisterRepo;
import com.example.trpz.service.TimeRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class TimeRegisterServiceImpl implements TimeRegisterService {
    private final TimeRegisterRepo timeRegisterRepo;
    @Override
    public List<TimeRegister> getDatesWhenTimeWasViolatedByUser(User user) {
        return null;
    }

    @Override
    public void save(TimeRegister timeRegister) {

    }

    @Override
    public List<TimeRegister> getByUserByToday(User user) {
        return null;
    }

    @Override
    public List<TimeRegister> getByUserBetweenDates(User user, LocalDate from, LocalDate to) {
        return null;
    }
}
