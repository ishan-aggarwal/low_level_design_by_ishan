package threadspackage;

import java.util.concurrent.*;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello I am in run method");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello I am in run method");
    }
}

// Thread -> Extends Thread, Implements Runnable, Implements Callable
// call method gives you two advantages over run method
// you can return something
// you can throw an exception as well

// ES, Future, As part of this
// - merge sort multithreaded way

// Synchronized, Mutex, Locks, Semaphores

// Atomic classes in Java

class MyCallable implements Callable<Integer> {
    int num1;
    int num2;

    public MyCallable(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Integer call() throws InterruptedException {

        Thread.sleep(10000);

        return num1 + num2;
    }
}

// in case u want to return something
// public interface Callable<V> {
// public V call();
//}
public class TestThreads {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable callable = new MyCallable(4, 5);
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Integer> res = es.submit(callable);
        System.out.println("0------------------");
        System.out.println(res.get());

        Thread thread = new MyThread(); // just an object is created
        thread.start(); // spawn as a thread
        thread.run(); // it is just a normal method call

        Runnable runnable1 = new MyRunnable();
//        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable1);
//        t1.run(); // ismein thread create h nahi hota...
//        t1.run(); // ismein thread create h nahi hota...
//        t1.run(); // ismein thread create h nahi hota...
        t1.start();
        // bas ek normal method call kar rahe ho..
//        t1.start();
//        t1.start();
//        t1.start();// create, to be running, runn , waiting/pause, dead

        // Runnable ka aapne object bana lia using lambda
//        Runnable tempRunnable = () -> {
//            System.out.println("Hello I am in run method");
//        };
//
//        Thread t2 = new Thread(tempRunnable);
//        t2.start();
//        t2.start(); // yeh likhne se... aap ke t2 object as thread start ho jaega... ab jaise h cpu isko execute karega.. run method ka code chal jaega
//        t2.run();

    }
}
