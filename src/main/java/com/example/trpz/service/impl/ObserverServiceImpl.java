package com.example.trpz.service.impl;

import com.example.trpz.repository.AdminRepo;
import com.example.trpz.repository.ObserverRepo;
import com.example.trpz.service.ObserverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ObserverServiceImpl implements ObserverService {
    private final ObserverRepo observerRepo;
    @Override
    public void reportViolation() {

    }
}
