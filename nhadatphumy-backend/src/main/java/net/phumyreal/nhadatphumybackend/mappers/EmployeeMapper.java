package net.phumyreal.nhadatphumybackend.mappers;

import net.phumyreal.nhadatphumybackend.models.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    public int insertEmployee(Employee employee);
    public int updateEmployee(Employee employee);
    public int deleteEmployeeId(long employeeId);
    public List<Employee> selectAllEmployee();
    public Employee selectEmployeeById(long employeeId);
}
