package com.example.trpz.service;

import com.example.trpz.entity.Report;
import com.example.trpz.entity.User;

public interface AdminService {
    void generationReport(Report report);
    void removeUser(Long id);
    void addNewUser(User user);
    void editRoleForUser(User user, String role);
}
