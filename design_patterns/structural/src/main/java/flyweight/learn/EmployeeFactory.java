package flyweight.learn;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {

    private static final Map<String, Employee> map = new HashMap<>();

    public static Employee getEmployee(String type) {
        Employee employee = null;

        if (map.containsKey(type)) {
            employee = map.get(type);
        } else {
            switch (type) {
                case "Developer" -> {
                    System.out.println("Developer created");
                    employee = new Developer();
                }
                case "Tester" -> {
                    System.out.println("Tester created");
                    employee = new Tester();
                }
                default -> System.out.println("No such employee");
            }
            map.put(type, employee);
        }
        return employee;
    }
}