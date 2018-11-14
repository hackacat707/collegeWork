/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productapp;

/**
 *
 * @author x17448556
 */
public class Electronic extends Product{
    String batteryType;

    public Electronic(String batteryType, String name, int price, String description) {
        super(name, price, description);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
    public String getDetails(){
        return name+" "+price+ " "+description+" ";
    
    };
    
   
}
