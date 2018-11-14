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
public class Product {
    
    protected String name;
    protected int price;
    protected String description;

    public Product() {
        
        name = "";
        price = 0;
        description = "";
    }

    public Product(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDetails(){
        return name+" "+price+ " "+description+" ";
    
    };
    
    
    
}

