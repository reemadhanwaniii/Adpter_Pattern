package Example5;

public class NewSystemGateway implements NewPaymentSystem{

    @Override
    public void pay(double amount) {
        System.out.println("Processing payment using new Payment gateway : "+amount);
    }
}
