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
public class Hangman {

    private final String secret;
    private String word;
    private char guess;
    private StringBuffer strBuff;
    private String guessMsg;

    public Hangman() {

        secret = "hello";
        strBuff = new StringBuffer("*****");
        word = "";
        guess = ' ';
        guessMsg = "";

    }

    public void setGuess(char guess) {
        this.guess = guess;
    }

    public void compute() {
        for (int i = 0; i < secret.length(); i++) {

            if (secret.charAt(i) == guess) {
                strBuff.setCharAt(i, guess);

            } 
            word = strBuff.toString();

        }
    }

    public String getWord() {
        return word;
    }

}
