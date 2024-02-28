public class DebitCard implements IPayment{
    @Override
    public boolean processPayment(double amount) {
        //logic
        System.out.println("DEBIT PAYMENT....");
        return true;
    }
}
