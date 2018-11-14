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
public class Food extends Product{
    String expirationDate;

    public Food(String expirationDate, String name, int price, String description) {
        super(name, price, description);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
    
}
