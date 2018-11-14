/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quoteapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author x17448556
 */
public class Quote {
    
    private String quote;

    /*public Quote() {
        
        //quote = "hello this is a quote";
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }*/
    
    public void readFromFile(){
        try{
            File f = new File("quote.txt");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            quote = (oStream.readObject()).toString();
            oStream.close();
            
        
        }
        catch(IOException | ClassNotFoundException ex){
        System.out.println(ex);
        }
    
    }
    public void printQuote(){
        JOptionPane.showMessageDialog(null, quote);
    
    }
    
    
    
}
