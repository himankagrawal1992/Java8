package Lambdas.BeforeLambdaExample1;

public class Executor {
/* If you want to execute Worker code, you construct an instance of Worker class and then submit
the instance to a thread pool
 */
    public void execute() {
        Worker worker = new Worker();
        new Thread(worker).start();
    }
}
