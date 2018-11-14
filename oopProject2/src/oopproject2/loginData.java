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
public class loginData implements Serializable{
    protected String name;
    protected String surname;

    public loginData() {
        
        name = " ";
        surname = " ";
    }

    public loginData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

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
    
  public String getDetails(){
      return name+""+surname ;
  }  
    
    
}
