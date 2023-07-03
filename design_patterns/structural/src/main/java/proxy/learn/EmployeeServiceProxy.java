package proxy.learn;

public class EmployeeServiceProxy implements EmployeeService {

    private EmployeeService employeeService;

    EmployeeServiceProxy() {
        this.employeeService = new EmployeeServiceImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if (client.equals("Admin")) {
            this.employeeService.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("Admin")) {
            this.employeeService.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client.equals("Admin") || client.equals("User")) {
            return this.employeeService.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}