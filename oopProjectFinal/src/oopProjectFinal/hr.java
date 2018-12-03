/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

import java.io.Serializable;

/**
 *
 * @author x18114245
 */
public class hr implements Serializable {

    private String firstname;
    private String surname;
    private String dob;
    private String id;
    private String address;
    private String ppsnumber;
    //overloaded constructor

    public hr(String firstname, String surname, String dob, String id, String address, String ppsnumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.dob = dob;
        this.id = id;
        this.address = address;
        this.ppsnumber = ppsnumber;
    }

    //default constructor
    public hr() {
        firstname = "";
        surname = "";
        dob = "";
        id = "";
        address = "";
        ppsnumber = "";
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPpsnumber() {
        return ppsnumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPpsnumber(String ppsnumber) {
        this.ppsnumber = ppsnumber;
    }

    public String employeedetails() {  /// CREATE EMPLOYEEDETAILS  METHOD TO RETURN FIRSTNAME,SURNAME ,ID AND ADDRESS WILL BE USED FOR POLYMORPHISM IN HR AND PAROLGUI
        return "firstname: " + firstname + "\n" + "surname:  " + surname + "\n" + "dob:  " + dob + "\n" + "id:  " + id + "\n" + "address:  " + address + "\n" + "ppsnumber:  " + ppsnumber + "\n";
    }
    //give methods innicial values of zero

    public Double prsi() {
        return 0.0;
    }

    public Double gross() {
        return 0.0;
    }

    public Double netpay() {
        return 0.0;

    }

    public Double taxablePay() {
        return 0.0;
    }

    public Double usc() {
        return 0.0;
    }

    public Double pay() {
        return 0.0;
    }
}
