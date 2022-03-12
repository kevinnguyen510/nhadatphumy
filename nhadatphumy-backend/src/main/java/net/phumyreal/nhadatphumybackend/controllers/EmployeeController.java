package net.phumyreal.nhadatphumybackend.controllers;

import net.phumyreal.nhadatphumybackend.models.Employee;
import net.phumyreal.nhadatphumybackend.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/mybatisPostgres/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // get all employees
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.selectAllEmployee();
    }

    // create employee rest api
    @PostMapping
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        HashMap<String, Object> response = new HashMap<String, Object>();
        try {
            employeeService.insertEmployee(employee);
        } catch (Exception e) {
            response.put("SUCCESS", false);;
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.ok(response);
    }

    // get employee by id rest api
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long id) {
        Employee employee = employeeService.selectEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    // update employee rest api

    @PutMapping("{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        HashMap<String, Object> response = new HashMap<String, Object>();
        Employee employee = employeeService.selectEmployeeById(id);
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        try {
            employeeService.updateEmployee(employee);
        } catch (Exception e) {
            response.put("SUCCESS", false);
            return ResponseEntity.ok(response);
        }
        response.put("SUCCESS", true);
        return ResponseEntity.ok(response);
    }

    // delete employee rest api
    @DeleteMapping("{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Map<String, Boolean> response = new HashMap<>();
        Employee employee = employeeService.selectEmployeeById(id);
        try {
            employeeService.deleteEmployeeId(employee.getId());
        } catch (Exception e) {
            response.put("deleted", Boolean.TRUE);
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.ok(response);
    }
}
