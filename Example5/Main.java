package Example5;

public class Main {
    static void main() {
        NewPaymentSystem razorPay = new NewSystemGateway();
        OldPaymentSystem adapter = new TwoWayAdapter(razorPay);
        adapter.makePayment(500,"INR");

        OldPaymentSystem oldPaymentSystem = new LegacySystemGateway();
        NewPaymentSystem adapter2 = new TwoWayAdapter(oldPaymentSystem);
        adapter2.pay(678);
    }
}
