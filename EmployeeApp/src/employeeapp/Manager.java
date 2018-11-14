/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.io.Serializable;

/**
 *
 * @author x17448556
 */
public class Manager extends Employee implements Serializable {
    private double salary;
    private double wPay;

    public Manager(double salary, String name, String id, String dob) {
        super(name, id, dob);
        this.salary = salary;
    }
    public Manager(){
        super();
        salary = 0.0;
        wPay = 0.0;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getwPay() {
        return wPay;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+ "," + salary;
    }
    @Override
    public void computeWPay(){
    wPay = salary/52;
    };
    
}
