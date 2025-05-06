package threads;

import java.util.*;

public class ListRunnable implements Runnable {

    int n;

    public ListRunnable(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ListRunnable listRunnable = new ListRunnable(10);
        Thread t1 = new Thread(listRunnable);
        Thread t2 = new Thread(listRunnable);
        Thread t3 = new Thread(listRunnable);
        t1.start();
        t2.start();
        t3.start();
    }
}
