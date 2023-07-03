package proxy.learn;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created new row into employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted row with employee id " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from the Db with employee id " + employeeId);
        return new Employee();
    }
}