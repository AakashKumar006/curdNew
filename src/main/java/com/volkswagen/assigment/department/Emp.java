package com.volkswagen.assigment.department;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TestEmpModel{
    String name;
    Integer phone;
    Integer age;

    public TestEmpModel(String name) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

};

class TestEmployee{
    public static void main(String[]args){
        List<TestEmpModel> listOfEmplyee =  new ArrayList<TestEmpModel>();
        listOfEmplyee.add(new TestEmpModel("aakash"));
        listOfEmplyee.add(new TestEmpModel("sam"));
        listOfEmplyee.add(new TestEmpModel("aakash"));

        //creating a set
        Set<TestEmpModel> setOfEmp = new HashSet<TestEmpModel>();

        for(TestEmpModel emp : listOfEmplyee){
            if(setOfEmp.add(emp)){
                System.out.println("dublicate");
            }

        }

        System.out.println(setOfEmp);




    }
}


