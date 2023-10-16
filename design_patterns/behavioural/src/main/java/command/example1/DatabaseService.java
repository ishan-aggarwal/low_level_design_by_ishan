package command.example1;

import java.util.HashMap;
import java.util.Map;

public class DatabaseService {

    private final Map<String, Integer> userBalance = new HashMap<>();

    public Integer getUserBalance(String user) {

        if (userBalance.containsKey(user)) {
            return userBalance.get(user);
        }

        throw new RuntimeException("User: " + user + " not registered with bank.");
    }

    public void deposit(String user, Integer amount) {
        userBalance.put(user, userBalance.getOrDefault(user, 0) + amount);
    }

    public void withdraw(String user, Integer amount) {
        if (userBalance.containsKey(user)) {
            userBalance.put(user, userBalance.get(user) - amount);
            return;
        }
        throw new RuntimeException("User: " + user + " not registered with bank.");
    }
}