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
public abstract class Employee implements Serializable {
    protected String name;
    protected String id;
    protected String dob;

    public Employee() {
        name = " ";
        id =  " ";
        dob = " ";
    }

    public Employee(String name, String id, String dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    public String printDetails(){
        return "Employee details: " +id+ "," + name +"," +dob;
    }
    
    public abstract void computeWPay();
    
    
}
