package singleton.breakableCondition;

public class BreakWithMultiThreading_02 {
    public static void main(String[] args) throws InterruptedException {
        Runnable instanceCreateTask = () -> {
            try {
                System.out.println("Thread:" + Thread.currentThread().getName() + " going to call the getInstance method.");
                SynchronizedBlockSingletonWithoutDoubleCheckLocking instance = SynchronizedBlockSingletonWithoutDoubleCheckLocking.getInstance();
                System.out.println("Thread:" + Thread.currentThread().getName() + " got the instance whose hashcode:" + instance.hashCode());
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(instanceCreateTask);
        Thread thread2 = new Thread(instanceCreateTask);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("You can see both instance have difference hashcode.");
    }

    static class SynchronizedBlockSingletonWithoutDoubleCheckLocking {
        private static SynchronizedBlockSingletonWithoutDoubleCheckLocking INSTANCE;

        private SynchronizedBlockSingletonWithoutDoubleCheckLocking() {
        }

        public static SynchronizedBlockSingletonWithoutDoubleCheckLocking getInstance() throws InterruptedException {
            if (INSTANCE == null) {
                Thread.sleep(2000);
                synchronized (SynchronizedBlockSingletonWithoutDoubleCheckLocking.class) {
                    INSTANCE = new SynchronizedBlockSingletonWithoutDoubleCheckLocking();
                }
            }
            return INSTANCE;
        }
    }
}

