package Lab4.Polymorphism.CompileTimePolymorphism;

public class CompileTimePolymorphismTest {

	public static void main(String[] args) {
		Payment payment = new Payment();

        payment.showPayment();

        payment.showPayment(123);
    }

	}

