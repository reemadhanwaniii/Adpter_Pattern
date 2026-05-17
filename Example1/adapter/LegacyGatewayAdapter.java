package Example1.adapter;

import Example1.legacyCode.LegacyGateway;
import Example1.payment.PaymentProcessor;

public class LegacyGatewayAdapter implements PaymentProcessor {

    private final LegacyGateway legacyGateway;
    private long currentRef;

    public LegacyGatewayAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Adapter: Translating processPayment() for " + amount + " " + currency);
        this.legacyGateway.executeTransaction(amount,currency);
        currentRef = this.legacyGateway.getRefrenceNumber();
    }

    @Override
    public boolean isPaymentSuccessful() {
        return this.legacyGateway.checkStatus(currentRef);
    }

    @Override
    public String getTransactionId() {
        return "Legacy_TXN" + currentRef;
    }
}
