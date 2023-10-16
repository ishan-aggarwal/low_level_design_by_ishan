package command.example1;

public class BankProvider {

    private final DatabaseService database;

    public BankProvider(DatabaseService database) {
        this.database = database;
    }

    public Integer getUserBalance(String user) {
        return database.getUserBalance(user);
    }

    public void deposit(String user, Integer amount) {
        database.deposit(user, amount);
    }

    public void withdraw(String user, Integer amount) {
        database.withdraw(user, amount);
    }
}