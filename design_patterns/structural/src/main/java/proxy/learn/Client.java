package proxy.learn;

public class Client {
    public static void main(String[] args) {
        try {
            EmployeeService employeeDao = new EmployeeServiceProxy();
            employeeDao.create("Admin", new Employee());
            employeeDao.create("User", new Employee());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
