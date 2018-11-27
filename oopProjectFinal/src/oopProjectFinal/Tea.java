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
public class Tea extends CoffeeShop{
    private String TeaType;
    private Double TeaTypeCost;
    public Double total;

    

    public Tea(String TeaType, Double TeaTypeCost, Double total, String Drink, String Sugar, String Milk, Double MilkCost, Double SugarCost, Double DrinkCost) {
        super(total, Drink, Sugar, Milk, MilkCost, SugarCost, DrinkCost);
        this.TeaType = TeaType;
        this.TeaTypeCost=TeaTypeCost;
        this.total=total;
    }

    public Tea() {
        super();
        TeaType="";
        TeaTypeCost=0.0;
        total = 0.0;
        
    }

    public String getTeaType() {
        return TeaType;
    }

    public void setTeaType(String TeaType) {
        this.TeaType = TeaType;
    }

    public Double getTeaTypeCost() {
        return TeaTypeCost;
    }

    public void setTeaTypeCost(Double TeaTypeCost) {
        this.TeaTypeCost = TeaTypeCost;
    }

   
    @Override
    public Double getTotal() {
        return total;
    }
     @Override
    public String printDetails(){
        return super.printDetails()+ ", Tea type: " + TeaType;
    }
    
    
    @Override
    public void computeTotalCost(){
        switch (TeaType) {
            case "Black":
                TeaTypeCost = 0.75;
                break;
            case "Green":
                TeaTypeCost = 1.0;
                break;
            default:
                TeaTypeCost = 1.25;
                break;
        }
        total = (DrinkCost*TeaTypeCost)+MilkCost+SugarCost;
    };
    
    

    
    
    
    
    
    
}
