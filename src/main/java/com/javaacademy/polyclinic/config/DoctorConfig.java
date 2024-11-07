package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.Doctor;
import com.javaacademy.polyclinic.SpecializationEnum;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DoctorProperty.class)
public class DoctorConfig {
    DoctorProperty doctorProperty;

    public DoctorConfig(DoctorProperty doctorProperty) {
        this.doctorProperty = doctorProperty;
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorProperty.getPricedentist(), SpecializationEnum.Dentist);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorProperty.getPricejuniorSurgeon(), SpecializationEnum.Surgeon);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorProperty.getPriceseniorSurgeon(), SpecializationEnum.Surgeon);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorProperty.getPricetherapist(), SpecializationEnum.Therapist);
    }
}
