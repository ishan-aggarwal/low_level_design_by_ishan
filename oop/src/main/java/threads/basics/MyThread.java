package threads.basics;

public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("Inside the run method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("run method has ended");
    }


    public static void main(String s[]) {
        System.out.println("main program started");

        Thread thread = new MyThread();
//        thread.start();
//        thread.run();
        thread.start();

        System.out.println("main program ended");
    }
}
