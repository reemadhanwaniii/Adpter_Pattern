package Example5;

import javax.xml.transform.Source;

public class LegacySystemGateway implements OldPaymentSystem{

    @Override
    public void makePayment(double amount, String currency) {
        System.out.println("Processing Payment using Legacy System "+ amount + " , "+currency);
    }
}
