package Lab6.Thread.ExtendingThreadClass;

public class Test {

	public static void main(String[] args) {
		// way1 test
        MyClass c1 = new MyClass();
        //c1.start();

        MyClass c2 = new MyClass();
        //c2.start();

        Thread thread1 = new MyClass();
        Thread thread2 = new MyClass();
        Thread thread3 = new MyClass();

        MyClass c3 = new MyClass();
        MyClass c4 = new MyClass();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
       
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}




