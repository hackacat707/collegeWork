/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduleapp;

import java.io.Serializable;

/**
 *
 * @author x17448556
 */
public class Module implements Serializable{
        protected String name;
        protected String lecturer;
        protected String date;
        protected String time;

    public Module() {
        
        name = " ";
        lecturer = " ";
        date = " ";
        time = " ";
    }

    public Module(String name, String lecturer, String date, String time) {
        this.name = name;
        this.lecturer = lecturer;
        this.date = date;
        this.time = time;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
    public String printModule(){
        return "Module Details: " + name + " ," + lecturer + " ," + date +" ," + time + " ,";
    
    }
    
        
        
    
}
