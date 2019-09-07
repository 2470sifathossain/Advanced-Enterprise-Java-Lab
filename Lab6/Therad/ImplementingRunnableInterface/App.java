package Lab6.Therad.ImplementingRunnableInterface;

public class App {

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
        MyClass c2 = new MyClass();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        Thread t3 = new Thread(new MyClass());
        Thread t4 = new Thread(new MyClass());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

	}

}
