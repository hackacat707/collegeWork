/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

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
 * @author x18114245
 */
public class hrGUI extends javax.swing.JFrame {
// declare variables in the base class

    String firstname;
    String surname;
    String dob;
    String id;
    String address;
    String ppsnumber;
    int count = 0;// set initial value to zero
    hr e; //MAKE INSTANT OF HR CLASS
    ArrayList<hr> aList = new ArrayList(); // declare AND CREATE ARRAYLISTL

    public hrGUI() {
        initComponents();
        readFromFile();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        view = new javax.swing.JButton();
        payrol = new javax.swing.JButton();
        search = new javax.swing.JButton();
        firstnameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        firstnameTF = new javax.swing.JTextField();
        surnameTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        ppsnumberLbl = new javax.swing.JLabel();
        ppsnumberTF = new javax.swing.JTextField();
        adressLbl = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("add new employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        view.setText("view existing employees");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        payrol.setText("payrol");
        payrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrolActionPerformed(evt);
            }
        });

        search.setText("search employee");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        firstnameLbl.setText("First name");

        surnameLbl.setText("Surname");

        idlbl.setText("ID");

        dobLbl.setText("DOB");

        firstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTFActionPerformed(evt);
            }
        });

        dobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTFActionPerformed(evt);
            }
        });

        ppsnumberLbl.setText("Pps number");

        ppsnumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppsnumberTFActionPerformed(evt);
            }
        });

        adressLbl.setText("Adress");

        Clear.setBackground(new java.awt.Color(255, 255, 102));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(payrol, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnameLbl)
                            .addComponent(surnameLbl)
                            .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobLbl)
                            .addComponent(ppsnumberLbl)
                            .addComponent(adressLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dobTF)
                                    .addComponent(idTF)
                                    .addComponent(surnameTF)
                                    .addComponent(firstnameTF)
                                    .addComponent(ppsnumberTF, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                    .addComponent(addressTF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(view, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Clear)
                                        .addGap(21, 21, 21)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(firstnameLbl)
                    .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnameLbl)
                            .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idlbl)
                            .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(view)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsnumberLbl)
                    .addComponent(ppsnumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLbl)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(payrol)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrolActionPerformed
        new hrGUI().setVisible(false);       //// HTGUI not visible  WHEN CLICKONH PAYROL BUTTON
        new payrolGUI().setVisible(true); //PAYROLGUI VISIBLE WHEN CICKING PAYROL BUTTON
        dispose();

    }//GEN-LAST:event_payrolActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String search = JOptionPane.showInputDialog("please enter name you want search for");
        for (int i = 0; i < aList.size(); i++) {
            if (search.equalsIgnoreCase(aList.get(i).getFirstname())) {
                JOptionPane.showMessageDialog(null, " the details your looking for are" + aList.get(i).employeedetails());
            }
    }//GEN-LAST:event_searchActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        e = new hr();
        // get text from text field and pass it to variable
        firstname = firstnameTF.getText();
        surname = surnameTF.getText();
        dob = dobTF.getText();
        id = idTF.getText();
        address = addressTF.getText();
        ppsnumber = ppsnumberTF.getText();
        e.setFirstname(firstname);
        e.setSurname(surname);
        e.setDob(dob);
        e.setId(id);
        e.setPpsnumber(ppsnumber);
        e.setAddress(address);
        aList.add(e); // add values to arraylist
        writeToFile();// instead of creating another add button we simpply call the wrIte to file method inside add btn
    }//GEN-LAST:event_jButton1ActionPerformed


    private void ppsnumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppsnumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppsnumberTFActionPerformed

    private void dobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTFActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        for (int i = 0; i < aList.size(); i++) {
            JOptionPane.showMessageDialog(null, aList.get(i).employeedetails());// PRINT EMOLOYEE DETAILS USING POLYMORPHISM

            firstnameTF.setText(aList.get(i).getFirstname());
            surnameTF.setText(aList.get(i).getFirstname());
            idTF.setText(aList.get(i).getId());
            dobTF.setText(aList.get(i).getDob());
            ppsnumberTF.setText(aList.get(i).getDob());
            addressTF.setText(aList.get(i).getAddress());
        }
    }//GEN-LAST:event_viewActionPerformed

    private void firstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTFActionPerformed

    }//GEN-LAST:event_firstnameTFActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        firstnameTF.setText("");
        surnameTF.setText("");
        idTF.setText("");
        surnameTF.setText("");
        dobTF.setText("");
        ppsnumberTF.setText("");
        addressTF.setText("");

    }//GEN-LAST:event_ClearActionPerformed
    public void writeToFile() {
        try {
            File f = new File("output.dat");//declare and create file object called output.dat used to write employees details
            FileOutputStream fStream = new FileOutputStream(f);//
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            // write the object
            oStream.writeObject(aList);//log declared earlier
            //close the output stream
            oStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void readFromFile() {
        try {
            File f = new File("output.dat");//declare and create file object called output.dat used to read employees details
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            // read the object from the file  array of object here called Log
            // convert prob   > cast it to remind it is a employee
            aList = (ArrayList<hr>) oStream.readObject();
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
            java.util.logging.Logger.getLogger(hrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel adressLbl;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField dobTF;
    private javax.swing.JLabel firstnameLbl;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel idlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton payrol;
    private javax.swing.JLabel ppsnumberLbl;
    private javax.swing.JTextField ppsnumberTF;
    private javax.swing.JButton search;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
