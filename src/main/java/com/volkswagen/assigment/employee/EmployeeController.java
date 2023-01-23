package com.volkswagen.assigment.employee;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

    @Autowired EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping("/")
    public String home(){
        return "Employee Management System";
    }


    @RequestMapping("/employee/{Id}") //get employee by id
    public Employee getEmployee (@PathVariable("Id") Integer employeeId){
        return employeeServiceImpl.getEmployee(employeeId);
    }

    @RequestMapping("/employee") //get list of all employee
    public List<Employee> getALlEmployee (){
        return employeeServiceImpl.getAllEmployee();
    }

    @PostMapping("/employee/add") //add new employee
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setDateOfJoining(new Date());
        return employeeServiceImpl.addEmployee(employee);
    }

    @DeleteMapping("/employee/delete/{employeeId}") // delete employee by id
    public String deleteEmployee(@PathVariable Integer employeeId){
        return employeeServiceImpl.deleteEmployee(employeeId);
    }

    @PutMapping("/employee/update") // update employee
    public String updateEmployee(@RequestBody Employee employee){
        return employeeServiceImpl.updateEmployee(employee);
    }
}
