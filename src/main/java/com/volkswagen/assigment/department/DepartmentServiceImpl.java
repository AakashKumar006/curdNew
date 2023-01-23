package com.volkswagen.assigment.department;

import com.volkswagen.assigment.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired DepartmentDao departmentDao;

    @Override
    public List<Department> getAllDepartment() {
        List<Department> department = departmentDao.findAll();
        return department;
    }
}
