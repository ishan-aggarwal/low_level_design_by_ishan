package singleton.doublecheckloading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {
    }

    // will work in a concurrent environment
    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {      // T1, T2 // First check without a lock
            synchronized (DatabaseConnection.class) { // T1, T2
                if (databaseConnection == null) { // Second check after a lock
                    databaseConnection = new DatabaseConnection(); // T1 T2
                }
            }
        }
        return databaseConnection;
    }
}
