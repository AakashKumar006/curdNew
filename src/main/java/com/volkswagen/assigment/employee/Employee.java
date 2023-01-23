package com.volkswagen.assigment.employee;

import com.volkswagen.assigment.department.Department;
import com.volkswagen.assigment.location.Location;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pk_employee")
    private Integer employeeId;

    @Column(name="employee_name")
    private String employeeName;

    @OneToOne
    @JoinColumn (name="fk_department")
    private Department Department;

    @OneToOne
    @JoinColumn(name="fk_location")
    private Location location;

    @Column(name="employee_date_of_joining")
    private Date dateOfJoining;

    @Column(name="employee_salary")
    private String employeeSalary;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public com.volkswagen.assigment.department.Department getDepartment() {
        return Department;
    }

    public void setDepartment(com.volkswagen.assigment.department.Department department) {
        Department = department;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
