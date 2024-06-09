package threads.basics;

public class ThreadUsingRunnable implements Runnable {
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

        Thread thread = new Thread(new ThreadUsingRunnable());
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("This thread is created using lambda");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("This thread is created using lambda has ended now");
        });
        thread1.start();

        System.out.println("main program ended");
    }
}
