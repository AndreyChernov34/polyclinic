package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;


/**
 *  Врач
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
     * метод Лечение человека
     * @return возвращает стоимость приема
     */
    public BigDecimal curePeople() {

        log.info(specializationEnum.toString() + " вылечил человека");
        return price;
    }


}
