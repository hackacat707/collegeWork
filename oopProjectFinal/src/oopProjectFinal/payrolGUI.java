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
 * @author x18114245
 */
public class payrolGUI extends javax.swing.JFrame {

    
    String firstname, surname;
    String address, dob,id ;
    String ppsnumber;
    Double  usc, netpay, healthInsurance, taxCredit, unionSubs, prsi,overTime ;
    Double gross, hours, rate;
    int count=0;
  
   payrol p;
   public ArrayList<hr> aList = new ArrayList();
    public payrolGUI() {
        initComponents();
         firstnameLbl.setVisible(false);
         firstname1TF.setVisible(false);
         surnameLbl.setVisible(false);
         surname1TF.setVisible(false);
         idlbl.setVisible(false);
         id1TF.setVisible(false);
         dobLbl.setVisible(false);
         dob1TF.setVisible(false);
         ppsnumberLbl.setVisible(false);
         ppsnumber1TF.setVisible(false);
         addressLbl.setVisible(false);
         addressTF.setVisible(false);
          hoursLbl.setVisible(false);
         hoursTF.setVisible(false);
          rateLbl.setVisible(false);
         rateTF.setVisible(false);
          dobLbl.setVisible(false);
         dob1TF.setVisible(false);
         overtimeLbl.setVisible(false);
         overtimeTF.setVisible(false);
         grossLbl.setVisible(false);
         grossTF.setVisible(false);
          prsilbl.setVisible(false);
         prsiTF.setVisible(false);
          taxCreditLbl.setVisible(false);
         taxCreditTF.setVisible(false);
          usclbl.setVisible(false);
         uscTF.setVisible(false);
          healthInsuranceLbl.setVisible(false);
         healthInsuranceTF.setVisible(false);
         unonSubsLbl.setVisible(false);
         unionSubsTF.setVisible(false);
         netpaylbl.setVisible(false);
         netpayTF.setVisible(false);
          paylbl.setVisible(false);
         payTF.setVisible(false);
         
        readFromFile();
        
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        id1TF = new javax.swing.JTextField();
        ppsnumber1TF = new javax.swing.JTextField();
        dob1TF = new javax.swing.JTextField();
        firstnameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        firstname1TF = new javax.swing.JTextField();
        ppsnumberLbl = new javax.swing.JLabel();
        surname1TF = new javax.swing.JTextField();
        hoursLbl = new javax.swing.JLabel();
        rateLbl = new javax.swing.JLabel();
        taxCreditLbl = new javax.swing.JLabel();
        rateTF = new javax.swing.JTextField();
        taxCreditTF = new javax.swing.JTextField();
        hoursTF = new javax.swing.JTextField();
        viewAddedPayslip = new javax.swing.JButton();
        healthInsuranceLbl = new javax.swing.JLabel();
        unonSubsLbl = new javax.swing.JLabel();
        healthInsuranceTF = new javax.swing.JTextField();
        unionSubsTF = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        addressLbl = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        viewAddedDetails = new javax.swing.JButton();
        overtimeLbl = new javax.swing.JLabel();
        overtimeTF = new javax.swing.JTextField();
        netpayTF = new javax.swing.JTextField();
        netpaylbl = new javax.swing.JLabel();
        grossLbl = new javax.swing.JLabel();
        grossTF = new javax.swing.JTextField();
        prsilbl = new javax.swing.JLabel();
        prsiTF = new javax.swing.JTextField();
        usclbl = new javax.swing.JLabel();
        uscTF = new javax.swing.JTextField();
        paylbl = new javax.swing.JLabel();
        payTF = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTextField4.setText("jTextField4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 499));
        setResizable(false);

        ppsnumber1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppsnumber1TFActionPerformed(evt);
            }
        });

        dob1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob1TFActionPerformed(evt);
            }
        });

        firstnameLbl.setText("First name");

        surnameLbl.setText("Surname");

        idlbl.setText("ID");

        dobLbl.setText("DOB");

        firstname1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname1TFActionPerformed(evt);
            }
        });

        ppsnumberLbl.setText("Pps number");

        hoursLbl.setText("hours");

        rateLbl.setText("rate");

        taxCreditLbl.setText("tax credit");

        taxCreditTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxCreditTFActionPerformed(evt);
            }
        });

        viewAddedPayslip.setText("view added payslips");
        viewAddedPayslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAddedPayslipActionPerformed(evt);
            }
        });

        healthInsuranceLbl.setText("health insurance");

        unonSubsLbl.setText("union subs");

        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        addressLbl.setText("address");

        viewAddedDetails.setText("view employees details");
        viewAddedDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAddedDetailsActionPerformed(evt);
            }
        });

        overtimeLbl.setText("overTime");

        netpaylbl.setText("netPay");

        grossLbl.setText("Gross");

        prsilbl.setText("PRSI");

        usclbl.setText("USC");

        paylbl.setText("Pay");

        payTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnameLbl)
                            .addComponent(surnameLbl)
                            .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobLbl)
                            .addComponent(ppsnumberLbl)
                            .addComponent(rateLbl)
                            .addComponent(hoursLbl))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstname1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surname1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ppsnumber1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hoursTF, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(rateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(addressTF))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unonSubsLbl)
                                    .addComponent(healthInsuranceLbl)
                                    .addComponent(overtimeLbl)
                                    .addComponent(grossLbl)
                                    .addComponent(netpaylbl)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usclbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(uscTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(taxCreditLbl)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(netpayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(taxCreditTF)
                                        .addComponent(healthInsuranceTF)
                                        .addComponent(overtimeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                        .addComponent(unionSubsTF)
                                        .addComponent(grossTF))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prsilbl)
                                .addGap(37, 37, 37)
                                .addComponent(prsiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paylbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(payTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(viewAddedPayslip)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(viewAddedDetails))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(add)))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addressLbl)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLbl)
                    .addComponent(firstname1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLbl)
                    .addComponent(surname1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlbl)
                    .addComponent(id1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dob1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ppsnumberLbl)
                    .addComponent(ppsnumber1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paylbl)
                    .addComponent(payTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursLbl)
                    .addComponent(hoursTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rateLbl)
                    .addComponent(rateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(overtimeLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(overtimeTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grossLbl)
                                    .addComponent(grossTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prsilbl)
                                    .addComponent(prsiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(usclbl)
                                            .addComponent(uscTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(healthInsuranceLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unonSubsLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(taxCreditTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(taxCreditLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(healthInsuranceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unionSubsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewAddedDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewAddedPayslip)
                                .addGap(79, 79, 79))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(netpaylbl)
                            .addComponent(netpayTF, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ppsnumber1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppsnumber1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppsnumber1TFActionPerformed

    private void dob1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob1TFActionPerformed

    private void viewAddedPayslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAddedPayslipActionPerformed

        
      
        firstnameLbl.setVisible(true);
         firstname1TF.setVisible(true);
         surnameLbl.setVisible(true);
         surname1TF.setVisible(true);
         idlbl.setVisible(true);
         id1TF.setVisible(true);
         dobLbl.setVisible(false);
         dob1TF.setVisible(false);
         ppsnumberLbl.setVisible(true);
         ppsnumber1TF.setVisible(true);
         addressLbl.setVisible(false);
         addressTF.setVisible(false);
          hoursLbl.setVisible(true);
         hoursTF.setVisible(true);
          rateLbl.setVisible(true);
         rateTF.setVisible(true);
        
         grossLbl.setVisible(true);
         grossTF.setVisible(true);
          prsilbl.setVisible(true);
         prsiTF.setVisible(true);
         
          usclbl.setVisible(true);
         uscTF.setVisible(true);
          
         netpaylbl.setVisible(true);
         netpayTF.setVisible(true);
          paylbl.setVisible(true);
         payTF.setVisible(true);
         for (int i=0;i<aList.size();i++){
       // System.out.println("printing: "+aList.get(i));
            
        if (aList.get(i).gross()==0.0||aList.get(i).taxablePay()==0.0||aList.get(i).prsi()==0.0){
             JOptionPane.showMessageDialog(null,"please enter finacial details of new entered employee like hours, rate ");
        }
         JOptionPane.showMessageDialog(null,"gross"+aList.get(i).gross());
          JOptionPane.showMessageDialog(null,"taxablePay"+aList.get(i).taxablePay());
          JOptionPane.showMessageDialog(null,"prsi"+aList.get(i).prsi());
          JOptionPane.showMessageDialog(null,"usc"+aList.get(i).usc()); 
          JOptionPane.showMessageDialog(null,"pay"+aList.get(i).pay());
          JOptionPane.showMessageDialog(null,"netpay"+aList.get(i).netpay());
           
    /* grossTF.setText(aList.get(i).getGross());
     netpayTF.setText(aList.get(i).getNetpay());
     prsiTF.setText(aList.get(i).getPRSI());
     uscTF.setText(aList.get(i).getUsc());
     payTF.setText(aList.get(i).getPay());*/
    }
    }//GEN-LAST:event_viewAddedPayslipActionPerformed
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  //e= new hr();
   firstnameLbl.setVisible(true);
         firstname1TF.setVisible(true);
         surnameLbl.setVisible(true);
         surname1TF.setVisible(true);
         idlbl.setVisible(true);
         id1TF.setVisible(true);
         dobLbl.setVisible(true);
         dob1TF.setVisible(true);
         ppsnumberLbl.setVisible(true);
         ppsnumber1TF.setVisible(true);
         addressLbl.setVisible(true);
         addressTF.setVisible(true);
          hoursLbl.setVisible(true);
         hoursTF.setVisible(true);
          rateLbl.setVisible(true);
         rateTF.setVisible(true);
         
         overtimeLbl.setVisible(true);
         overtimeTF.setVisible(true);
         grossLbl.setVisible(true);
         grossTF.setVisible(true);
         
          taxCreditLbl.setVisible(true);
         taxCreditTF.setVisible(true);
          
          healthInsuranceLbl.setVisible(true);
         healthInsuranceTF.setVisible(true);
         unonSubsLbl.setVisible(true);
         unionSubsTF.setVisible(true);
  p=new payrol();
      firstname=firstname1TF.getText();
        surname=surname1TF.getText();
        id=id1TF.getText();
        dob=dob1TF.getText(); 
        ppsnumber=ppsnumber1TF.getText();
        address=addressTF.getText();
      
        hours=Double.parseDouble(hoursTF.getText());
        rate=Double.parseDouble(rateTF.getText());
        taxCredit=Double.parseDouble(taxCreditTF.getText());
        healthInsurance=Double.parseDouble(healthInsuranceTF.getText());
        unionSubs=Double.parseDouble(unionSubsTF.getText());
        overTime=Double.parseDouble(overtimeTF.getText());
    
        
        p.setFirstname(firstname);
        p.setSurname(surname);
        p.setId(id);
        p.setPpsnumber(ppsnumber);
        p.setDob(dob);
        p.setAddress(address);
      p.setHours(hours);
      p.setRate(rate);
      p.setOverTime(overTime);
   //   p.setTaxablePay(taxCredit);
      p.setUsc(usc);
      p.setTaxCredit(taxCredit);
   p.setUnionSubs(unionSubs);
  p.setHealthInsurance(healthInsurance);
              
      aList.add(p);
      
     System.out.println("alist: "+aList.toString());
      writeToFile();
 
    }//GEN-LAST:event_addActionPerformed

    private void viewAddedDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAddedDetailsActionPerformed
     firstnameLbl.setVisible(true);
         firstname1TF.setVisible(true);
         surnameLbl.setVisible(true);
         surname1TF.setVisible(true);
         idlbl.setVisible(true);
         id1TF.setVisible(true);
         dobLbl.setVisible(true);
         dob1TF.setVisible(true);
         ppsnumberLbl.setVisible(true);
         ppsnumber1TF.setVisible(true);
         addressLbl.setVisible(true);
         addressTF.setVisible(true);
          hoursLbl.setVisible(true);
         hoursTF.setVisible(true);
          rateLbl.setVisible(true);
         rateTF.setVisible(true);
         
         overtimeLbl.setVisible(true);
         overtimeTF.setVisible(true);
         grossLbl.setVisible(false);
         grossTF.setVisible(false);
         
          taxCreditLbl.setVisible(true);
         taxCreditTF.setVisible(true);
          
          healthInsuranceLbl.setVisible(true);
         healthInsuranceTF.setVisible(true);
         unonSubsLbl.setVisible(true);
         unionSubsTF.setVisible(true);
        
        for (int i=0;i<aList.size();i++){
       
       // System.out.println("printing: "+aList.get(i));
          JOptionPane.showMessageDialog(null,aList.get(i).employeedetails());
          firstname1TF.setText(aList.get(i).getFirstname());
          surname1TF.setText(aList.get(i).getFirstname());
          id1TF.setText(aList.get(i).getId());
        dob1TF.setText(aList.get(i).getDob()); 
        ppsnumber1TF.setText(aList.get(i).getDob());
        addressTF.setText(aList.get(i).getAddress());
       /*
        
        taxCreditTF.setText(aList.get(i).getTaxCredit() );
        healthInsuranceTF.setText(aList.get(i).gethealthInsurance());
        unionSubsTF.setText(aList.get(i).getUnionSubs());
        hoursTF.setText(aList.get(i).getHours());
        rateTF.setText(aList.get(i).getRate());
        overtimeTF.setText(aList.get(i).getOvertime());
        
      */
         
            
      }
    }//GEN-LAST:event_viewAddedDetailsActionPerformed

    private void taxCreditTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxCreditTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxCreditTFActionPerformed

    private void firstname1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname1TFActionPerformed

    private void payTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payTFActionPerformed
public void writeToFile(){
        try{
            File a= new File("output.dat");//declare and create file object
            FileOutputStream b = new FileOutputStream(a);//
            ObjectOutputStream c = new ObjectOutputStream(b);
            // write the object
            c.writeObject(aList);//log declared earlier
            //close the output stream
            c.close();
        }
        
        catch(IOException e){
            System.out.println(e);
        }
    }
    public void readFromFile(){
        try{
            File a = new File ("output.dat");
            FileInputStream b= new FileInputStream(a);
            ObjectInputStream c= new ObjectInputStream(b);
            // read the object from the file  array of object here called Log
            // convert prob   > cast it to remind it is a employee
            aList=(ArrayList<hr>)c.readObject();
            c.close();
            
            
        }
        catch (IOException|ClassNotFoundException ex){
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
            java.util.logging.Logger.getLogger(payrolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payrolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payrolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payrolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payrolGUI().setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField dob1TF;
    private javax.swing.JLabel dobLbl;
    private javax.swing.JTextField firstname1TF;
    private javax.swing.JLabel firstnameLbl;
    private javax.swing.JLabel grossLbl;
    private javax.swing.JTextField grossTF;
    private javax.swing.JLabel healthInsuranceLbl;
    private javax.swing.JTextField healthInsuranceTF;
    private javax.swing.JLabel hoursLbl;
    private javax.swing.JTextField hoursTF;
    private javax.swing.JTextField id1TF;
    private javax.swing.JLabel idlbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField netpayTF;
    private javax.swing.JLabel netpaylbl;
    private javax.swing.JLabel overtimeLbl;
    private javax.swing.JTextField overtimeTF;
    private javax.swing.JTextField payTF;
    private javax.swing.JLabel paylbl;
    private javax.swing.JTextField ppsnumber1TF;
    private javax.swing.JLabel ppsnumberLbl;
    private javax.swing.JTextField prsiTF;
    private javax.swing.JLabel prsilbl;
    private javax.swing.JLabel rateLbl;
    private javax.swing.JTextField rateTF;
    private javax.swing.JTextField surname1TF;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JLabel taxCreditLbl;
    private javax.swing.JTextField taxCreditTF;
    private javax.swing.JTextField unionSubsTF;
    private javax.swing.JLabel unonSubsLbl;
    private javax.swing.JTextField uscTF;
    private javax.swing.JLabel usclbl;
    private javax.swing.JButton viewAddedDetails;
    private javax.swing.JButton viewAddedPayslip;
    // End of variables declaration//GEN-END:variables
}
