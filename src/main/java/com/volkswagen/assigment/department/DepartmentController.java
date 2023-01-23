package com.volkswagen.assigment.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {

    @Autowired DepartmentServiceImpl departmentServiceImpl;

    @RequestMapping("/department")
    public List<Department> getALlEmployee (){
        return departmentServiceImpl.getAllDepartment();
    }


}
