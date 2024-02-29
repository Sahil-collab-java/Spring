public class CreditCard implements IPayment{
    @Override
    public boolean processPayment(double amount) {
        //logic
        System.out.println("CREDIT CARD PAYMENT...");
        return true;
    }
}
