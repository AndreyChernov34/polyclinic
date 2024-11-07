package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Класс Касса
 */
@Component
@Slf4j
public class Cashier {
    /**
     * Доход
     */
    private BigDecimal profit = BigDecimal.ZERO;

    /**
    *   метод получения оплаты
    */
    public void acceptPayments(BigDecimal payment) {
        profit = profit.add(payment);

    }

    /**
     *  метод вывода общего дохода
     */
    public void printProfit() {

        log.info(String.valueOf("Общий доход в кассе:" + profit));
    }

}
