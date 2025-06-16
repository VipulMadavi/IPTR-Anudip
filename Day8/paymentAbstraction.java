public class paymentAbstraction {
    public static void main(String[] args) {
        Payment p1 = new payCC();
        p1.processPay(1000);
        Payment p2 = new payUPI();
        p2.processPay(2000);
    }

}

abstract class Payment {
    abstract void processPay(double amount);

    Payment() {
        System.out.println("Payment System");
    }
}

class payCC extends Payment {
    @Override
    void processPay(double amount) {
        System.out.println("Paying by Credit Card");
        System.out.println("Amount: " + amount);
    }
}

class payUPI extends Payment {
    @Override
    void processPay(double amount) {
        System.out.println("Paying by UPI : " + amount);
    }
}