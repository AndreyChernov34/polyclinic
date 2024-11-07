package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
@Slf4j
public class Doctor {
    private SpecializationEnum specializationEnum;
    private BigDecimal price;

    public Doctor(BigDecimal price, SpecializationEnum specializationEnum) {
        this.price = price;
        this.specializationEnum = specializationEnum;
    }

    public BigDecimal curePeople () {
        log.debug(specializationEnum + "вылечил человека");
        return price;
    }


}
