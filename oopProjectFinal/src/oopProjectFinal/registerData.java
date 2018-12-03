/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

import java.io.Serializable;

/**
 *
 * @author x17448556
 */
//this is the child class
public class registerData extends loginData implements Serializable{
    //variables
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String retype;

    public registerData(String name, String surname, String email, String phone, String retype, String username, String password) {
        //contructor
        super(username, password);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.retype = retype;
    }
    

   

    public registerData() {
        //initialise variables
        super();
        name = "";
        surname = "";
        email="";
        phone="";
        retype="";
    }
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    
    //getdetails method
    public String getDetails(){
 
        return super.getPass()+getUser();
    }
}
