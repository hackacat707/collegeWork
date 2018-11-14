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
public class FloorStaff extends Employee implements Serializable{
    private double rate;
    private double hours;
    private double wPay;

    public FloorStaff(double rate, double hours, String name, String id, String dob) {
        super(name, id, dob);
        this.rate = rate;
        this.hours = hours;
    }
    public FloorStaff(){
        super();
        rate = 0.0;
        hours = 0.0;
        wPay = 0.0;
        
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public double getwPay() {
        return wPay;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails()+ "," + rate+ "," + hours;
    }
    
    @Override
    public void computeWPay(){
    wPay = rate*hours;
    };
}
