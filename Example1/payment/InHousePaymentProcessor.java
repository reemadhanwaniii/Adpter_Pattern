package Example1.payment;

public class InHousePaymentProcessor implements PaymentProcessor {

    private boolean paymentSuccessful;
    private String transactionId;

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Processing Payment : "+ amount +" , "+currency);
        transactionId = "TXN_" + System.currentTimeMillis();
        paymentSuccessful = true;
        System.out.println("In-house process : success ,Transaction ID : "+transactionId);
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentSuccessful;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
