package com.example.trpz.service;

import com.example.trpz.entity.TimeRegister;
import com.example.trpz.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface TimeRegisterService {
    List<TimeRegister> getDatesWhenTimeWasViolatedByUser(User user);

    void save(TimeRegister timeRegister);
    List<TimeRegister> getByUserByToday(User user);
    List<TimeRegister> getByUserBetweenDates(User user, LocalDate from, LocalDate to);
}
