package Example1;

import Example1.payment.InHousePaymentProcessor;
import Example1.payment.PaymentProcessor;
import Example1.service.CheckoutService;

public class EcommerceAppV1 {
    public static void main() {
        PaymentProcessor processor = new InHousePaymentProcessor();
        CheckoutService checkoutService = new CheckoutService(processor);
        checkoutService.checkout(89776,"USD");
    }
}
