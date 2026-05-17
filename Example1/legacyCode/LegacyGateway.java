package Example1.legacyCode;

import java.sql.Ref;

public class LegacyGateway {
    private long transactionReference;
    private boolean paymentSuccessful;

    public void executeTransaction(double totalAmount,String currency) {
        System.out.println("LegacyGateway: Executing " + currency + " " + totalAmount);
        transactionReference = System.nanoTime();
        paymentSuccessful = true;
        System.out.println("LegacyGateway: Done. Ref: " + transactionReference);
    }

    public boolean checkStatus(long Refno) {
        System.out.println("Checking Status for Refernece No : "+ Refno);
        return paymentSuccessful;
    }
    public long getRefrenceNumber() {
        return transactionReference;
    }
}
