package Lab4.Polymorphism.RunTimePolymorphism;

public class RunTimePolymorphismTest {

	public static void main(String[] args) {
		Payment payment = new CashPayment();
        payment.payment(123);

        Payment payment1 = new CardPayment();
        payment1.payment(456);
    }

	}

