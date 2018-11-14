/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanapp;

/**
 *
 * @author x17448556
 */
import javax.swing.*;
public class HangmanApp {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String word;
            char guess;
            //String guessMsg;
            String input;
            
            Hangman hangmanGame = new Hangman();
            
            input= JOptionPane.showInputDialog(null,"Enter a letter");
            guess = input.charAt(0);
            hangmanGame.setGuess(guess);
            hangmanGame.compute();
            word = hangmanGame.getWord();
            
            JOptionPane.showMessageDialog(null, word);
    }
    
}
