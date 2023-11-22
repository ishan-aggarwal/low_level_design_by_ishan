package singleton.breakableCondition;


public class BreakWithClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableSingleton instance1 = CloneableSingleton.getInstance();
        CloneableSingleton instance2 = (CloneableSingleton) instance1.clone();
        System.out.println("instance1 hashcode:" + instance1);
        System.out.println("instance2 hashcode:" + instance2);
        System.out.println("You can see both instance have difference hashcode.");
    }

    static class CloneableSingleton implements Cloneable {
        private static CloneableSingleton INSTANCE;

        private CloneableSingleton() {
        }

        @Override
        public Cloneable clone() throws CloneNotSupportedException {
            return (CloneableSingleton) super.clone();
        }

        public static CloneableSingleton getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new CloneableSingleton();
            }
            return INSTANCE;
        }
    }
}


