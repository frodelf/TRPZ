package com.example.trpz.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Guest extends User{
    private LocalDate toValidityPeriod;
}
