package Example5;

public class TwoWayAdapter implements OldPaymentSystem,NewPaymentSystem{

    private NewPaymentSystem newPaymentSystem;
    private OldPaymentSystem oldPaymentSystem;

    public TwoWayAdapter(NewPaymentSystem newPaymentSystem) {
        this.newPaymentSystem = newPaymentSystem;
    }


    public TwoWayAdapter(OldPaymentSystem oldPaymentSystem) {
        this.oldPaymentSystem = oldPaymentSystem;
    }

    @Override
    public void pay(double amount) {
        if(oldPaymentSystem != null) {
            this.oldPaymentSystem.makePayment(amount,"INR");
        }
    }

    @Override
    public void makePayment(double amount, String currency) {
        if(newPaymentSystem != null) {
            this.newPaymentSystem.pay(amount);
        }
    }
}
