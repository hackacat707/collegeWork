/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

/**
 *
 * @author x17448556
 */
public class MultipleQ extends BasicQuestion {
    private String optionA;
    private String optionB;
    private String optionC;

    public MultipleQ(String optionA, String optionB, String optionC, String question, String correctAnswer, double mark, String answer) {
        super(question, correctAnswer, mark, answer);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    
    
}
