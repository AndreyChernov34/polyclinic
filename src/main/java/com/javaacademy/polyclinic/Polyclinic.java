package com.javaacademy.polyclinic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Polyclinic {
    private Cashier cashier;
    private Doctor dentist;
    private Doctor juniorSurgeon;
    private Doctor seniorSurgeon;
    private Doctor therapist;

    public Polyclinic(Cashier cashier, Doctor dentist, Doctor juniorSurgeon, Doctor seniorSurgeon, Doctor therapist) {
        this.cashier = cashier;
        this.dentist = dentist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
        this.therapist = therapist;
    }

    public void cureDentist() {

        cashier.acceptPayments(dentist.curePeople());
    }

    public void cureJuniorSurgeon() {
        cashier.acceptPayments(juniorSurgeon.curePeople());
    }

    public void cureSeniorSurgeon() {
        cashier.acceptPayments(seniorSurgeon.curePeople());
    }

    public void cureTherapist() {
        cashier.acceptPayments(therapist.curePeople());
    }


}
