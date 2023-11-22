package singleton.breakableCondition;

import java.io.*;

public class BreakWithSerialization implements Serializable {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SerializableSingleton instance1 = SerializableSingleton.getInstance();
        SerializableSingleton instance2 = (SerializableSingleton) getSerializedCopy(instance1);
        System.out.println("instance1 :" + instance1);
        System.out.println("instance2 :" + instance2);
        System.out.println("You can see both instance have difference hashcode.");
    }

    public static Object getSerializedCopy(Object sourceObject) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sourceObject);
        objectOutputStream.flush();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    static class SerializableSingleton implements Serializable {
        private static SerializableSingleton INSTANCE;

        private SerializableSingleton() {
        }

        public static SerializableSingleton getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new SerializableSingleton();
            }
            return INSTANCE;
        }
    }
}


