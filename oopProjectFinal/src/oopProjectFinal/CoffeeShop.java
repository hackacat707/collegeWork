/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

/**
 *
 * @author x17432284
 */
public class CoffeeShop {
    
    public Double total;
    private String Drink;
    private String Sugar;
    private String Milk;
    public Double MilkCost;
    public Double SugarCost;
    public Double DrinkCost;

    
    public CoffeeShop() {
        total = 0.0;
        Drink = "";
        Sugar = "";
        Milk = "";
        MilkCost = 0.0;
        SugarCost = 0.0;
        DrinkCost=0.0;
        
        
    }

    public CoffeeShop(Double total, String Drink, String Sugar, String Milk, Double MilkCost, Double SugarCost, Double DrinkCost) {
        this.total = total;
        this.Drink = Drink;
        this.Sugar = Sugar;
        this.Milk = Milk;
        this.MilkCost = MilkCost;
        this.SugarCost = SugarCost;
        this.DrinkCost = DrinkCost;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String Drink) {
        this.Drink = Drink;
    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(String Sugar) {
        this.Sugar = Sugar;
    }

    public String getMilk() {
        return Milk;
    }

    public void setMilk(String Milk) {
        this.Milk = Milk;
    }

    public Double getMilkCost() {
        return MilkCost;
    }

    public void setMilkCost(Double MilkCost) {
        this.MilkCost = MilkCost;
    }

    public Double getSugarCost() {
        return SugarCost;
    }

    public void setSugarCost(Double SugarCost) {
        this.SugarCost = SugarCost;
    }

    public Double getDrinkCost() {
        return DrinkCost;
    }

    public void setDrinkCost(Double DrinkCost) {
        this.DrinkCost = DrinkCost;
    }
    public String printDetails(){
        return "Drink:" +Drink+ ", Sugar:" + Sugar +", Milk:" +Milk;
    }
    
    public void computeTotalCost(){
        if(Sugar.equalsIgnoreCase("Yes")) {
            SugarCost=0.50;
        }
        else if(Sugar.equalsIgnoreCase("No")){
            SugarCost=0.0;
        }
        else{
            SugarCost= 0.0;
        }
        
        if(Milk.equalsIgnoreCase("Yes")) {
            MilkCost=0.50;
        }
        else if(Milk.equalsIgnoreCase("No")){
            MilkCost=0.0;
        }
        else{
            MilkCost= 0.0;
        }
        
        total = DrinkCost+MilkCost+SugarCost;
    };
    
    
    
    
    
}
