package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;


/**
 * класс Врач
 * @specializtion   - специализация
 * @price           - стоимость приема
 */
@Slf4j
public class Doctor {
    private SpecializationEnum specializationEnum;
    private BigDecimal price;

    public Doctor(BigDecimal price, SpecializationEnum specializationEnum) {
        this.price = price;
        this.specializationEnum = specializationEnum;
    }

    /**
    *   метод Лечение человека
    */
    public BigDecimal curePeople() {
        log.debug(specializationEnum + "вылечил человека");
        return price;
    }


}
