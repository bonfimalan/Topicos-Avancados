package purchase;

import payments.Payment;
import payments.implementation.NoPayment;

public class Purchase {
    private Payment payment;

    public Purchase() {
        this.payment = new NoPayment();
    }

    public void processPayment() {
        payment.pay();
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
