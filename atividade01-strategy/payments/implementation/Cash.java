package payments.implementation;

import payments.Payment;

public class Cash implements Payment{

    @Override
    public void pay() {
        System.out.println("Payed with cash");
    }
}
