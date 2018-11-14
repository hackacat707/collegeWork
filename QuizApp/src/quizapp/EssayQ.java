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
public class EssayQ extends BasicQuestion{
    private int maxWordCount;

    public EssayQ(int maxWordCount, String question, String correctAnswer, double mark, String answer) {
        super(question, correctAnswer, mark, answer);
        this.maxWordCount = maxWordCount;
    }

    public void setMaxWordCount(int maxWordCount) {
        this.maxWordCount = maxWordCount;
    }
    
    
}
