package payments.implementation;

import payments.Payment;

public class Credit implements Payment{

    @Override
    public void pay() {
        System.out.println("Payed with credit card");
    }
    
}
