package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class Cashier {
    private BigDecimal profit = BigDecimal.ZERO;

    public void acceptPayments(BigDecimal payment) {
        profit = profit.add(payment);

    }

    public void printProfit(){
        log.info(String.valueOf(profit));
    }

}
