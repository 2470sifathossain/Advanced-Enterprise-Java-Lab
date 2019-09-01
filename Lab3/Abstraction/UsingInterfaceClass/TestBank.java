package Lab3.Abstraction.UsingInterfaceClass;

public class TestBank {

	public static void main(String[] args) {
		Bank bank = new Brac();
        System.out.println(bank.getInterest());

        Bank bank1 = new Hsbc();
        System.out.println(bank1.getInterest());
    }

	}


