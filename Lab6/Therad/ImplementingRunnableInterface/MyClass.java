package Lab6.Therad.ImplementingRunnableInterface;

public class MyClass implements Runnable {
    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Thread is " + Thread.currentThread().getId() + " and the Value is " + i);

}
}
}