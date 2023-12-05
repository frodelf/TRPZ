package com.example.trpz.repository;

import com.example.trpz.entity.TimeRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRegisterRepo extends JpaRepository<TimeRegister, Long> {
}
