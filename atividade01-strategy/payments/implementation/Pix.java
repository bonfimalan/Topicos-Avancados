package payments.implementation;

import payments.Payment;

public class Pix implements Payment{

    @Override
    public void pay() {
        System.out.println("Payed with pix");
    }
}
