package flyweight.learn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
Prototype is a creational pattern. Flyweight is a structural pattern.
In the prototype, we create a duplicate object by cloning. In Flyweight, we reuse the existing object.
 */

public class FlyweightApp {
    private static final String[] employeeType = {"Developer", "Tester"};
    private static final String[] developerSkills = {"Java", "C#", "Python"};
    private static final String[] testerSkills = {"Manual", "Automation"};
    private static final Random random = new Random();

    private static Set<Integer> hashSet = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String employeeType = getRandomEmployee();
            Employee employee = EmployeeFactory.getEmployee(employeeType);
            if (employeeType.equals("Developer")) {
                employee.assignSkill(getRandomDeveloperSkill());
            } else if (employeeType.equals("Tester")) {
                employee.assignSkill(getRandomTesterSkill());
            }
            employee.task();
            hashSet.add(employee.hashCode());
        }
        System.out.println(hashSet);
    }

    private static String getRandomDeveloperSkill() {
        int index = random.nextInt(developerSkills.length);
        return developerSkills[index];
    }

    private static String getRandomTesterSkill() {
        int index = random.nextInt(testerSkills.length);
        return testerSkills[index];
    }

    private static String getRandomEmployee() {
        int index = random.nextInt(employeeType.length);
        return employeeType[index];
    }
}