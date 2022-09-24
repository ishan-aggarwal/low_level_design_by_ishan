package singleton.doublecheckloading;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance("db");
        System.out.println(databaseConnection.hashCode());
        databaseConnection = DatabaseConnection.getInstance("db");
        System.out.println(databaseConnection.hashCode());
    }
}