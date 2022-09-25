package singleton.eagerloading;

public class DatabaseConnection {
    private static final DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection() {
    }

    // Eager loading of the object creation
    // Object will still be created in case no one makes a request to getInstance method
    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}
