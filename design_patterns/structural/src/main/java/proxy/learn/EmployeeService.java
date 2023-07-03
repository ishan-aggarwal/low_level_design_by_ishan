package proxy.learn;

public interface EmployeeService {
    void create(String client, Employee obj) throws Exception;

    void delete(String client, int employeeId) throws Exception;

    Employee get(String client, int employeeId) throws Exception;
}