package com.example.onlinevoting.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public abstract class Base {
    private LocalDate createdAt;

    private LocalDate updatedAt;
}
