package net.phumyreal.nhadatphumybackend.services;

import net.phumyreal.nhadatphumybackend.models.Employee;
import java.util.List;

public interface EmployeeService {
    public void insertEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public void deleteEmployeeId(long employeeId);
    public List<Employee> selectAllEmployee();
    public Employee selectEmployeeById(long employeeId);
}
