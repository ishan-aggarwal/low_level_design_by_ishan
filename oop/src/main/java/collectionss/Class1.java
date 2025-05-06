package collectionss;

import java.util.HashMap;
import java.util.Map;

public class Class1 {
    public void solve(int[] A) {
        int n = A.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int ele = A[i];
            if (freqMap.containsKey(ele)) {
                int count = freqMap.get(ele);
                freqMap.put(ele, count + 1);
            } else {
                freqMap.put(ele, 1);
            }
        }
        System.out.println(freqMap);
    }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        int[] A = {2, 5, 6, 1, 2, 5, 1, 5, 6, 6};
        obj.solve(A);
    }
}
