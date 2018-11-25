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
public class loginData implements Serializable {

    protected String username;
    protected String password;

    public loginData() {

        username = " ";
        password = " ";
    }

    public loginData(String username, String password) {

        this.username = username;
        this.password = password;
    }

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

    public String getDetails() {
        return "your username is "+username;
    }

}
