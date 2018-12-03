/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

/**
 *
 * @author x17432284
 */
public class Coffee extends CoffeeShop{
    //variables 
    private String CoffeeType;
    private Double CoffeeTypeCost;
    public Double total;

    public Coffee(String CoffeeType, Double CoffeeTypeCost, Double total, String Drink, String Sugar, String Milk, Double MilkCost, Double SugarCost, Double DrinkCost) {
        super(total, Drink, Sugar, Milk, MilkCost, SugarCost, DrinkCost);
        this.CoffeeType = CoffeeType;
        this.CoffeeTypeCost = CoffeeTypeCost;
        this.total=total;
        
    }

    public Coffee() {
        super();
        CoffeeType="";
        CoffeeTypeCost=0.0;
    }
    
    //getters and setters
    public String getCoffeeType() {
        return CoffeeType;
    }

    public void setCoffeeType(String CoffeeType) {
        this.CoffeeType = CoffeeType;
    }

    public Double getCoffeeTypeCost() {
        return CoffeeTypeCost;
    }

    public void setCoffeeTypeCost(Double CoffeeTypeCost) {
        this.CoffeeTypeCost = CoffeeTypeCost;
    }
    
    //overriding calculations from CoffeeShop.java
    @Override
    public Double getTotal() {
        return total;
    }
    @Override
    public String printDetails(){
        return super.printDetails()+ ", Coffee type: " + CoffeeType;
    }
    @Override
    public void computeTotalCost(){
        switch (CoffeeType) {
            case "Weak":
                CoffeeTypeCost = 0.75;
                break;
            case "Strong":
                CoffeeTypeCost = 1.0;
                break;
            default:
                CoffeeTypeCost = 1.25;
                break;
        }
        total = (DrinkCost*CoffeeTypeCost)+MilkCost+SugarCost;
    };
    
    
    
    
}
