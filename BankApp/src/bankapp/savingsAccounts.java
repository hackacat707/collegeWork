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
public class savingsAccounts extends bankAccounts{
    double interestRate;

    public savingsAccounts(double accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        
        interestRate = 0.034;
    }

    public savingsAccounts(double interestRate, double accountNumber, double balance, String accountName) {
        super(accountNumber, balance, accountName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    
    
    
}
