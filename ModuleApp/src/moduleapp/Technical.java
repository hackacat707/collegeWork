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
public class Technical extends Module implements Serializable{
    
        private String labTime;
        private String labAssistant;

    public Technical(String name, String lecturer, String date, String time) {
        super(name, lecturer, date, time);
        this.labAssistant= labAssistant;
        this.labTime = labTime;
            
    }

    public Technical() {
        labAssistant = " ";
        labTime = " ";
    }

    public String getLabTime() {
        return labTime;
    }

    public void setLabTime(String labTime) {
        this.labTime = labTime;
    }

    public String getLabAssistant() {
        return labAssistant;
    }

    public void setLabAssistant(String labAssistant) {
        this.labAssistant = labAssistant;
    }
    
    
        
        
    
}
