package com.example.trpz.service.impl;

import com.example.trpz.entity.TimeRegister;
import com.example.trpz.entity.User;
import com.example.trpz.entity.Worker;
import com.example.trpz.repository.TimeRegisterRepo;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class TimeRegisterServiceImplTest {
    @Mock
    private TimeRegisterRepo timeRegisterRepo;

    @InjectMocks
    private TimeRegisterServiceImpl timeRegisterService;
    @Test
    void save() {
        TimeRegister timeRegister = new TimeRegister();
        timeRegisterService.save(timeRegister);
        verify(timeRegisterRepo, times(1)).save(timeRegister);
    }

    @Test
    void getByUserByToday() {
        User user = new Worker();
        LocalDate today = LocalDate.now();
        when(timeRegisterRepo.findAllByUserAndDateCreated(user, today)).thenReturn(Collections.singletonList(new TimeRegister()));
        List<TimeRegister> timeRegisters = timeRegisterService.getByUserByToday(user);
        assertEquals(1, timeRegisters.size());
    }

    @Test
    void getByUserBetweenDates() {
        User user = new Worker();
        LocalDate from = LocalDate.of(2023, 1, 1);
        LocalDate to = LocalDate.of(2023, 12, 31);
        when(timeRegisterRepo.findByDateCreatedBetweenAndUser(from, to, user)).thenReturn(Collections.singletonList(new TimeRegister()));
        List<TimeRegister> timeRegisters = timeRegisterService.getByUserBetweenDates(user, from, to);
        assertEquals(1, timeRegisters.size());
    }
}