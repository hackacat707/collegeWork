/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author x17448556
 */
public class LoginGUI extends javax.swing.JFrame {
    loginData u;
    registerData t;
    String username;
    String password;
    ArrayList<loginData> details = new ArrayList();
    /**
     * Creates new form LoginGUI
     */
   
    

    public LoginGUI() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        loginPanel = new javax.swing.JPanel();
        loginTitleLbl = new javax.swing.JLabel();
        loginNameTxt = new javax.swing.JTextField();
        loginNamelbl = new javax.swing.JLabel();
        loginPassLbl = new javax.swing.JLabel();
        loginPassTxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        guestBtn = new javax.swing.JButton();
        staffLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setLayout(new java.awt.GridBagLayout());

        loginTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginTitleLbl.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 159);
        loginPanel.add(loginTitleLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 4, 0, 0);
        loginPanel.add(loginNameTxt, gridBagConstraints);

        loginNamelbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginNamelbl.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 66, 0, 0);
        loginPanel.add(loginNamelbl, gridBagConstraints);

        loginPassLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginPassLbl.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 66, 0, 0);
        loginPanel.add(loginPassLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 77;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        loginPanel.add(loginPassTxt, gridBagConstraints);

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 66, 0, 0);
        loginPanel.add(loginBtn, gridBagConstraints);

        guestBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        guestBtn.setText("Guest?");
        guestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        loginPanel.add(guestBtn, gridBagConstraints);

        staffLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffLogin.setText("Staff login");
        staffLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 66, 93, 0);
        loginPanel.add(staffLogin, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        loginData u = new loginData();
        registerData t = new registerData();
        username = loginNameTxt.getText();
        password = loginPassTxt.getText();
        if(username.equalsIgnoreCase("bob123") && password.equalsIgnoreCase("bob123"))
        {
            System.out.println("Welcome to the coffee shop");
        }
        else
        {
            System.out.println("You have entered incorrect information");
        }
        this.setVisible(false);
        OrderGUI order = new OrderGUI();

        order.setVisible(true);
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void guestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        OrderGUI order = new OrderGUI();

        order.setVisible(true);
        
    }//GEN-LAST:event_guestBtnActionPerformed

    private void staffLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StaffLogin staff = new StaffLogin();

        staff.setVisible(true);
    }//GEN-LAST:event_staffLoginActionPerformed
    public void readFromFile() {
        try {
            File f = new File("details.dat");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            details = (ArrayList<loginData>) oStream.readObject();
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guestBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginNameTxt;
    private javax.swing.JLabel loginNamelbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginPassLbl;
    private javax.swing.JTextField loginPassTxt;
    private javax.swing.JLabel loginTitleLbl;
    private javax.swing.JButton staffLogin;
    // End of variables declaration//GEN-END:variables
}