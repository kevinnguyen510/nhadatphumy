package net.phumyreal.nhadatphumybackend.services;

import net.phumyreal.nhadatphumybackend.mappers.EmployeeMapper;
import net.phumyreal.nhadatphumybackend.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "employeeService")
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    EmployeeMapper employeeMapper;

    public void insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
         employeeMapper.updateEmployee(employee);
    }

    public void deleteEmployeeId(long employeeId) {
        employeeMapper.deleteEmployeeId(employeeId);
    }

    public List<Employee> selectAllEmployee() {
        return employeeMapper.selectAllEmployee();
    }

    public Employee selectEmployeeById(long employeeId) {
        return employeeMapper.selectEmployeeById(employeeId);
    }

}
