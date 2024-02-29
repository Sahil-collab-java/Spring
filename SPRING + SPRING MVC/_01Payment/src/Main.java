public class Main {
    public static void main(String[] args) {
        IPayment p = new CreditCard();
        PaymentService ps = new PaymentService(p);
        ps.doPayment(100.03);
    }
}