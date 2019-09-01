package Lab4.Polymorphism.RunTimePolymorphism;

public class CardPayment implements Payment{
	@Override
    public void payment(double amount) {
        System.out.println("tk - " + amount + " is paid by Cash.");
    }
}
