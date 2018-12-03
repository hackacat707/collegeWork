/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class loginData implements Serializable {
    //this is the super class where everything is declared and set
    //variables for the login class

    protected String username;
    protected String password;

    public loginData() {
        //initialise variables
        username = " ";
        password = " ";
    }

    public loginData(String username, String password) {
        //constructor
        this.username = username;
        this.password = password;
    }

    

   
    //setters and getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //the get detail methods
    public String getUser() {
        return " your username is "+username;
        
    }
    public String getPass(){
        return " your password is " +password;
    }

}
