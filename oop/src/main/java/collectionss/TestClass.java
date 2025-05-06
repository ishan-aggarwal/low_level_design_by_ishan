package collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TestClass {

    public static void main(String[] args) {
        int[] arr = new int[2]; // this size is fixed
        // and it can not be extended
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));
//        arr[2] = 30;
//        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(100);
        list.add(200);
        System.out.println(list);
        list.add(300); // list is dynamic in nature
        // and it can increase it's size based on need...
        // jab bhi size bhar jaega.. to yeh apne aap ko double kr legi
        System.out.println(list);
        
        // O(1) access.. by index..
        // but by key... binary search.. linear search
        // insertion in array/list are slow
        // agar beech mein kuch dala.. to tumhara slow h hoga...
        // kynk shifthing krni padegi elements ki///
        // har ek element ko right mein shift karna hoga..
        // fir ek jagah banegi aur usmein tum new element daal doge

        
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        // yeh bhi dynamic hoti hai
        // ismein access slow hota hai..
        // ek ek krke access hota hai... O(N)
        // insertion deletion fast hoti hai..
        // kynk tum kahi se bhi next pointer adjust krke
        // insert / delete kr dete ho..
        
        for (int i = 0; i < head.size(); i++) {
            head.get(i);
        }
    }
}
