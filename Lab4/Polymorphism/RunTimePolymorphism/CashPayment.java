package Lab4.Polymorphism.RunTimePolymorphism;

public class CashPayment implements Payment {
	
	@Override
    public void payment(double amount) {
        System.out.println("tk - " + amount + " is paid by Card.");
    }

}
