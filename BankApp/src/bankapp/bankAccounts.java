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
public class bankAccounts {
    
    protected double accountNumber ;
    protected double balance;
    protected String accountName;

    public bankAccounts() {
        
        accountNumber = 0.0;
        balance = 0.0;
        accountName = " ";
    }

    public bankAccounts(double accountNumber, double balance, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
    public String accountDetails(){
        return "Name: "+ accountName+ "Account Number" + accountNumber + "Balance: " + balance;
    }
    
    
    
    
    
    
}
