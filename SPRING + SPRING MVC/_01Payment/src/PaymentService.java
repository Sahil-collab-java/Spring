public class PaymentService {
    private  IPayment iPayment;

public PaymentService(IPayment iPayment){
    this.iPayment = iPayment;
}

    public void doPayment(double amount){

        if(iPayment.processPayment(amount)){
            System.out.println("Payment is Process...");
        }else {
            System.out.println("Payement is Fail....");
        }

    }
}
