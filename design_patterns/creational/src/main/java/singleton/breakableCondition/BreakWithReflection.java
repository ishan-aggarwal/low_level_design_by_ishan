package singleton.breakableCondition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakWithReflection {

    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ReflectionSingleton instance1 = ReflectionSingleton.getInstance();
        ReflectionSingleton instance2 = null;

        Constructor[] allConstructors = ReflectionSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : allConstructors) {
            if (constructor.getParameterCount() == 0) {
                constructor.setAccessible(true);
                instance2 = (ReflectionSingleton) constructor.newInstance();
            }
        }
        System.out.println("instance1 :" + instance1);
        System.out.println("instance2 :" + instance2);
        System.out.println("You can see both instance have difference hashcode.");
    }

    static class ReflectionSingleton {
        private static ReflectionSingleton INSTANCE;

        private ReflectionSingleton() {
        }

        public static ReflectionSingleton getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new ReflectionSingleton();
            }
            return INSTANCE;
        }
    }
}
