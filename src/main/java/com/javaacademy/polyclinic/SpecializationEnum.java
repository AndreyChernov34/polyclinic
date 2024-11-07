package com.javaacademy.polyclinic;

public enum SpecializationEnum {
    Dentist("Стоматолог"),
    Surgeon("Хирург"),
    Therapist("Терапевт");

    private final String description;

    SpecializationEnum(String description) {
        this.description = description;
    }
}
