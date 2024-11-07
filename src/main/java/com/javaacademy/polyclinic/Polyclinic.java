package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *Класс Поликлиника
 */
@Component
@Slf4j
public class Polyclinic {
    private Cashier cashier;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;
    private Doctor therapist;

    /**
     * Конструктор Поликлиники
     * @param cashier           касса
     * @param dentist           Стоматолог
     * @param juniorSurgeon     Младший хирург
     * @param seniorSurgeon     Старший хирург
     * @param therapist         Терапевт
     */
    public Polyclinic(Cashier cashier, Doctor dentist, Doctor juniorSurgeon, Doctor seniorSurgeon, Doctor therapist) {
        this.cashier = cashier;
        this.dentist = dentist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
        this.therapist = therapist;
    }

    /**
     * метод лечения Стоматолога
     */
    public void cureDentist() {

        cashier.acceptPayments(dentist.curePeople());
    }

    /**
     * метод лечения младшего хирурга
     */
    public void cureJuniorSurgeon() {
        cashier.acceptPayments(juniorSurgeon.curePeople());
    }

    /**
     * метод лечения старшего хирурга
     */
    public void cureSeniorSurgeon() {
        cashier.acceptPayments(seniorSurgeon.curePeople());
    }

    /**
     * метод лечения терапевта
     */
    public void cureTherapist() {
        cashier.acceptPayments(therapist.curePeople());
    }


}
