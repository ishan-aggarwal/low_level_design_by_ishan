package singleton.singlethreaded;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        System.out.println(databaseConnection.hashCode());
        databaseConnection = DatabaseConnection.getInstance();
        System.out.println(databaseConnection.hashCode());

    }
}