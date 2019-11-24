/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanspractical;

import java.io.Serializable;

/**
 *
 * @author himan
 */
public class EmployeeBean implements Serializable{
    private int empID;
    private String name;
    private double salary;
    private int age;
    String designation;
    
    public EmployeeBean() {
        
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public float overtime() {
        return (float) ((salary) * (10/100));
    }
    public float fine() {
        return 100;
    }
}
