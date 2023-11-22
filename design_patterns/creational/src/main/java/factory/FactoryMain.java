package factory;

public class FactoryMain {

    public static void main(String[] args) {
        OS os = Factory.getInstance(OSType.WINDOWS);
        if (null == os) {
            System.out.println("It is not a valid OS");
            return;
        }
        os.description();
    }
}