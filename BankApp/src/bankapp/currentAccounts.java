/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author x17448556
 */
public class currentAccounts extends bankAccounts{
    
    double atmCharge;

    public currentAccounts(double accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        atmCharge = 0.25;
    }

    public currentAccounts(double atmCharge, double accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        this.atmCharge = atmCharge;
    }

    public double getAtmCharge() {
        return atmCharge;
    }

    public void setAtmCharge(double atmCharge) {
        this.atmCharge = atmCharge;
    }
    
    
    
}
