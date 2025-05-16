package Lambdas.BeforeLambdaExample1;

public class Worker implements Runnable {
/* If you want to do work in a separate thread, you put the work into the run method of Runnable*/
    @Override
    public void run() {
        for (int i=0; i<1000; i++) {
            System.out.println("Run method " + i);
        }
    }
}
