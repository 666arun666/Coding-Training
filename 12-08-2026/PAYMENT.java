abstract class payment {
    abstract void processPayment();
}
class CreditCardPayment extends payment {
    void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
class debitCardPayment extends payment {
    void processPayment() {
        System.out.println("Processing debit card payment.");
    }
}
class upiPayment extends payment {
    void processPayment() {
        System.out.println("Processing UPI payment.");
    }
}
public class PAYMENT {
    public static void main(String[] args) {
        payment creditCard = new CreditCardPayment();
        payment debitCard = new debitCardPayment();
        payment upi = new upiPayment();

        creditCard.processPayment();
        debitCard.processPayment();
        upi.processPayment();
    }
}
