/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anna
 */
public class RegisterGUI extends javax.swing.JFrame {

    loginData u;
    registerData t;
    ArrayList<loginData> details = new ArrayList();
    ArrayList<loginData> passArray = new ArrayList();
    ArrayList<loginData> userArray = new ArrayList();
    String name;
    String surname;
    String password;
    String username;
    String email;
    String phone;
    String retype;

    /**
     * Creates new form DataGUI
     */
    public RegisterGUI() {
        initComponents();

        readFromFile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        surnameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        retypeLbl = new javax.swing.JLabel();
        surnameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        retypeTxt = new javax.swing.JTextField();
        displayBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        userLbl = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        toLoginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLbl.setText("Register");

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameLbl.setText("Name");

        surnameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surnameLbl.setText("Surname");

        passwordLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordLbl.setText("Password");

        emailLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailLbl.setText("Email");

        phoneLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneLbl.setText("Phone no");

        retypeLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        retypeLbl.setText("Retype password");

        surnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameTxtActionPerformed(evt);
            }
        });

        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        userLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userLbl.setText("Username");

        toLoginBtn.setText("Login");
        toLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(surnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(surnameTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userLbl))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTxt)
                            .addComponent(passwordTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(nameTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(retypeLbl)
                            .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTxt)
                            .addComponent(retypeTxt))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayBtn)
                    .addComponent(addBtn)
                    .addComponent(toLoginBtn))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(addBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLbl))
                            .addComponent(displayBtn))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameLbl))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toLoginBtn))
                    .addComponent(userLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypeLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLbl))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        registerData t = new registerData();
        loginData u = new loginData();
        t.setName(nameTxt.getText());
        t.setSurname(surnameTxt.getText());
        if (t instanceof registerData) {

            t = (registerData) t;
            u = (loginData) u;

            //((registerData) (t)).setPassword(passwordTxt.getText());
            //((registerData) (t)).setUsername(userTxt.getText());
            u.setPassword(passwordTxt.getText());
            u.setUsername(userTxt.getText());
            t.setEmail(emailTxt.getText());
            t.setPhone(phoneTxt.getText());
            t.setRetype(retypeTxt.getText());
        }
        details.add(t);
        userArray.add(u);
        passArray.add(u);
        writeToFile();
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < userArray.size(); i++) {
            
            JOptionPane.showMessageDialog(null, "the details are " + userArray.get(i).getUser());
        }
        for (int i = 0; i < passArray.size(); i++) {
            JOptionPane.showMessageDialog(null, " " + passArray.get(i).getPass());
        }

    }//GEN-LAST:event_displayBtnActionPerformed

    private void surnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameTxtActionPerformed

    private void toLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLoginBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginGUI lGUI = new LoginGUI();

        lGUI.setVisible(true);
    }//GEN-LAST:event_toLoginBtnActionPerformed
    public void writeToFile() {
        try {
            File f = new File("user.dat");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(userArray);
            oStream.writeObject(passArray);

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            File f = new File("details.dat");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(details);

            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void readFromFile() {
        try {
            File f = new File("user.dat");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            userArray = (ArrayList<loginData>) oStream.readObject();
            passArray = (ArrayList<loginData>) oStream.readObject();
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel retypeLbl;
    private javax.swing.JTextField retypeTxt;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JTextField surnameTxt;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton toLoginBtn;
    private javax.swing.JLabel userLbl;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
