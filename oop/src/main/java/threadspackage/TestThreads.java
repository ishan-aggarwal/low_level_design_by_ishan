package threadspackage;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello I am in run method");
    }
}


public class TestThreads {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        // Runnable ka aapne object bana lia using lambda
        Runnable tempRunnable = () -> {
            System.out.println("Hello I am in run method in lambda");
            System.out.println("this is also part of run method in lambda");
        };

        Thread t2 = new Thread(tempRunnable);
//        t2.start(); // yeh likhne se... aap ke t2 object as thread start ho jaega... ab jaise h cpu isko execute karega.. run method ka code chal jaega
//        t2.run();

    }
}
