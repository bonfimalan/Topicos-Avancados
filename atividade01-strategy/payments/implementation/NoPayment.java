package payments.implementation;

import payments.Payment;

public class NoPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("You must choose a payment method");
    }
    
}
