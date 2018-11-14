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
public class Business extends Module implements Serializable{
    
        private String tutorial1;
        private String tutorial2;

    public Business(String name, String lecturer, String date, String time) {
        super(name, lecturer, date, time);
        this.tutorial1 = tutorial1;
        this.tutorial2 = tutorial2;
        
    }

    public Business() {
        super();
        tutorial1 = " ";
        tutorial2 = " ";
    }

    public String getTutorial1() {
        return tutorial1;
    }

    public void setTutorial1(String tutorial1) {
        this.tutorial1 = tutorial1;
    }

    public String getTutorial2() {
        return tutorial2;
    }

    public void setTutorial2(String tutorial2) {
        this.tutorial2 = tutorial2;
    }
    
    
        
        
    
}
