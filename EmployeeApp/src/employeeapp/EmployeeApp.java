/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author x17448556
 */
public class EmployeeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmployeeGUI myGUI = new EmployeeGUI();
        myGUI.setVisible(true);
        /*FloorStaff f1 = new FloorStaff(15.50, 20, "Joe", "5555", "12/06/1987");
        System.out.println(f1.printDetails());
        
        Manager m2 = new Manager(20000.20, "Tom. T", "45654", "20/05/1986");
        System.out.println(m2.printDetails());
        m2.computeWPay();
        System.out.println("Weekly pay: " +m2.getwPay());*/
        
    }
    
}
