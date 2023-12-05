package com.example.trpz.service.impl;

import com.example.trpz.entity.Report;
import com.example.trpz.entity.User;
import com.example.trpz.repository.AdminRepo;
import com.example.trpz.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepo adminRepo;
    @Override
    public void generationReport(Report report) {

    }

    @Override
    public void removeUser(Long id) {

    }

    @Override
    public void addNewUser(User user) {

    }

    @Override
    public void editRoleForUser(User user, String role) {

    }
}
