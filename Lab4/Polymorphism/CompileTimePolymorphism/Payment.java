package Lab4.Polymorphism.CompileTimePolymorphism;

public class Payment {
	
	public void showPayment(double amount){
        System.out.println("Payment amount is : " + amount);
    }

    public void showPayment(){
        System.out.println("No payment.");
    }

}
