package passbyreference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonPrimitivesUnitTest {
    @Test
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);
        // Before Modification
        assertEquals(a.num, 1);
        assertEquals(b.num, 1);
        modify(a, b);
        // After Modification
        assertEquals(a.num, 2);
        assertEquals(b.num, 1);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list);
        modifyList(list);
        System.out.println(list);


    }

    public static void modifyList(List<Integer> list) {
        list = new ArrayList<>();
        list.add(2);
    }

    public static void modify(Foo a1, Foo b1) {
        a1.num++;
        b1 = new Foo(10);
        b1.num++;
        System.out.println(b1.num == 11);
    }
}

class Foo {
    public int num;
    public Foo(int num) {
        this.num = num;
    }
}