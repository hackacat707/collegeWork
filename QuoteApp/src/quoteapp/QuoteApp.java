/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quoteapp;

import javax.swing.JOptionPane;

/**
 *
 * @author x17448556
 */
public class QuoteApp {
    String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quote q  = new Quote();
        
         q.readFromFile();
        
        //JOptionPane.showMessageDialog(name);
        q.printQuote();
        
        
    }
    
}
