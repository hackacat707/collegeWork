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
public class BasicQuestion {
    
    protected String question;
    protected String correctAnswer;
    protected double mark;
    protected String answer;

    public BasicQuestion() {
        
        question = "";
        correctAnswer = "";
        mark = 0.0;
        answer = "";
    }

    public BasicQuestion(String question, String correctAnswer, double mark, String answer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.mark = mark;
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getAnswer() {
        return answer;
    }
    
    
    
    
}
