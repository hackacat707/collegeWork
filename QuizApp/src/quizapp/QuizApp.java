/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import javax.swing.JOptionPane;

/**
 *
 * @author x17448556
 */
public class QuizApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuizGUI quiz = new QuizGUI();
        quiz.setVisible(true);
        /*String question;
        String correctAnswer;
        double mark;
        String answer;*/
        /*BasicQuestion myQuestion = new BasicQuestion();
        question = JOptionPane.showInputDialog(null, "Enter your question");
        correctAnswer= JOptionPane.showInputDialog(null, "Enter the answer to the question");
        mark = Double.parseDouble(JOptionPane.showInputDialog(null, "How many marks will this question be worth"));
        
        JOptionPane.showMessageDialog(null, "This question is " +mark+ "marks");*/
        
    }
    
}
