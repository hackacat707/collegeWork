/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

import java.util.ArrayList;

/**
 *
 * @author x17448556
 */
public class QuizGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuizGUI
     */
    ArrayList<BasicQuestion> quizQ = new ArrayList();
    String question;
        String correctAnswer;
        double mark;
        String answer;
        
    public QuizGUI() {
        initComponents();
        questionLbl.setVisible(false);
        questionTxt.setVisible(false);
        cAnswerLbl.setVisible(false);
        cAnswerTxt.setVisible(false);
        marksLbl.setVisible(false);
        marksTxt.setVisible(false);
        answerLbl.setVisible(false);
        answerTxt.setVisible(false);
        optionALbl.setVisible(false);
        optionBLbl.setVisible(false);
        optionCLbl.setVisible(false);
        optionATxt.setVisible(false);
        optionBTxt.setVisible(false);
        optionCTxt.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quizLbl = new javax.swing.JLabel();
        questionLbl = new javax.swing.JLabel();
        questionTxt = new javax.swing.JTextField();
        cAnswerLbl = new javax.swing.JLabel();
        cAnswerTxt = new javax.swing.JTextField();
        marksTxt = new javax.swing.JTextField();
        marksLbl = new javax.swing.JLabel();
        answerTxt = new javax.swing.JTextField();
        answerLbl = new javax.swing.JLabel();
        maxLbl = new javax.swing.JLabel();
        maxTxt = new javax.swing.JTextField();
        optionATxt = new javax.swing.JTextField();
        optionBTxt = new javax.swing.JTextField();
        optionCTxt = new javax.swing.JTextField();
        addQBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        optionALbl = new javax.swing.JLabel();
        optionBLbl = new javax.swing.JLabel();
        optionCLbl = new javax.swing.JLabel();
        multiQBtn = new javax.swing.JButton();
        essayQBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        quizLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quizLbl.setText("Quiz");

        questionLbl.setText("Question");

        questionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTxtActionPerformed(evt);
            }
        });

        cAnswerLbl.setText("Correct answer");

        marksLbl.setText("Marks");

        answerLbl.setText("Answer");

        maxLbl.setText("Max word count");

        addQBtn.setText("Add Question");
        addQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display Questions");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        optionALbl.setText("Option A");

        optionBLbl.setText("OptionB");

        optionCLbl.setText("Option C");

        multiQBtn.setText("MultiQuestion");
        multiQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiQBtnActionPerformed(evt);
            }
        });

        essayQBtn.setText("Essay");
        essayQBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                essayQBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(quizLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cAnswerLbl)
                            .addComponent(marksLbl)
                            .addComponent(questionLbl)
                            .addComponent(answerLbl)
                            .addComponent(maxLbl)
                            .addComponent(optionBLbl)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(optionCLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optionALbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cAnswerTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marksTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(questionTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(optionBTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(optionCTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(optionATxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(maxTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(answerTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addQBtn)
                    .addComponent(displayBtn)
                    .addComponent(multiQBtn)
                    .addComponent(essayQBtn))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLbl)
                    .addComponent(questionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addQBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cAnswerLbl)
                    .addComponent(cAnswerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marksLbl)
                    .addComponent(multiQBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerLbl)
                    .addComponent(essayQBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionATxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionALbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionCTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optionBLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionCLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTxtActionPerformed

    private void addQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_addQBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayBtnActionPerformed

    private void multiQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiQBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiQBtnActionPerformed

    private void essayQBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_essayQBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_essayQBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addQBtn;
    private javax.swing.JLabel answerLbl;
    private javax.swing.JTextField answerTxt;
    private javax.swing.JLabel cAnswerLbl;
    private javax.swing.JTextField cAnswerTxt;
    private javax.swing.JButton displayBtn;
    private javax.swing.JButton essayQBtn;
    private javax.swing.JLabel marksLbl;
    private javax.swing.JTextField marksTxt;
    private javax.swing.JLabel maxLbl;
    private javax.swing.JTextField maxTxt;
    private javax.swing.JButton multiQBtn;
    private javax.swing.JLabel optionALbl;
    private javax.swing.JTextField optionATxt;
    private javax.swing.JLabel optionBLbl;
    private javax.swing.JTextField optionBTxt;
    private javax.swing.JLabel optionCLbl;
    private javax.swing.JTextField optionCTxt;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JTextField questionTxt;
    private javax.swing.JLabel quizLbl;
    // End of variables declaration//GEN-END:variables
}
