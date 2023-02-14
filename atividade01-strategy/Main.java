import payments.implementation.Cash;
import payments.implementation.Credit;
import payments.implementation.Debit;
import payments.implementation.Pix;
import purchase.Purchase;

public class Main {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.processPayment();

        purchase.setPayment(new Credit());
        purchase.processPayment();

        purchase.setPayment(new Debit());
        purchase.processPayment();

        purchase.setPayment(new Pix());
        purchase.processPayment();

        purchase.setPayment(new Cash());
        purchase.processPayment();
    }    
}