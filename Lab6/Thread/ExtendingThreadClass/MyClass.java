package Lab6.Thread.ExtendingThreadClass;

public class MyClass extends Thread {
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread is " + Thread.currentThread().getId() + " and the Value is " + i);
        }

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

