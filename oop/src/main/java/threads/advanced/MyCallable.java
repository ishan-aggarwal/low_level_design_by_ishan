package threads.advanced;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return 100;
    }

    public static void main(String[] args) {

        System.out.println("Main program has started.");


        MyCallable callable = new MyCallable();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<Integer> future = executorService.submit(callable);

        System.out.println("Main program has started - 123.");
        System.out.println("Main program has started - 123 2.");

        try {
            System.out.println(future.get()); // blocking call
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main program has started - 456.");


        System.out.println("Main program has ended.");

        executorService.shutdownNow();

    }


}
