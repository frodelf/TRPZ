package com.example.trpz.repository;

import com.example.trpz.entity.Admin;
import com.example.trpz.entity.Report;
import com.example.trpz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepo extends JpaRepository<Admin, Long> {
}
