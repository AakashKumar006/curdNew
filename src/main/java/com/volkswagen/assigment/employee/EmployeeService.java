package com.volkswagen.assigment.employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployee(Integer employeeId);

    String deleteEmployee(Integer employeeId);

    String updateEmployee(Employee employee);

    Employee addEmployee(Employee employee);



}
