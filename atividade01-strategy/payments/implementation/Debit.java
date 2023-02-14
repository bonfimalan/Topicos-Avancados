package payments.implementation;

import payments.Payment;

public class Debit implements Payment {

    @Override
    public void pay() {
        System.out.println("Payed with debit card");
    }
}
