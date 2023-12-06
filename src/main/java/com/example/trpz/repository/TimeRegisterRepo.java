package com.example.trpz.repository;

import com.example.trpz.entity.TimeRegister;
import com.example.trpz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TimeRegisterRepo extends JpaRepository<TimeRegister, Long> {
    List<TimeRegister> findAllByUserAndDateCreated(User user, LocalDate dateCreated);
    List<TimeRegister> findByDateCreatedBetweenAndUser(LocalDate from, LocalDate to, User user);
}
