/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.io.Serializable;

/**
 *
 * @author Anna
 */
public class registerData extends loginData implements Serializable{
    private String password;
    private String email;
    private String phone;
    private String retype;
    
    

    public registerData(String password, String email, String phone, String retype, String name, String surname) {
        super(name, surname);
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.retype = retype;
    }

    public registerData() {
        super();
        password ="";
        email="";
        phone="";
        retype="";
        
    }

    public String getPassword() {
        return password;
    }

   

    public void setPassword(String password) {
        this.password = password;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRetype() {
        return retype;
    }

    public void setRetype(String retype) {
        this.retype = retype;
    }
    
    
    public String getDetails(){
 
        return super.getDetails()+" your email is "+email+ " " + "your phone number is " + " " + phone+ " ";
    }
}
