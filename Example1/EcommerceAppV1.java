package Example1;

import Example1.adapter.LegacyGatewayAdapter;
import Example1.legacyCode.LegacyGateway;
import Example1.payment.InHousePaymentProcessor;
import Example1.payment.PaymentProcessor;
import Example1.service.CheckoutService;

public class EcommerceAppV1 {
    public static void main() {
        PaymentProcessor processor = new InHousePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(processor);
        checkoutService.checkout(89776,"USD");

        // Legacy gateway through adapter
        System.out.println("\n--- Using Legacy Gateway via Adapter ---");
        LegacyGateway legacyGateway = new LegacyGateway();
        processor = new LegacyGatewayAdapter(legacyGateway);
        CheckoutService legacyCheckout = new CheckoutService(processor);
        legacyCheckout.checkout(765.99,"INR");
    }
}
