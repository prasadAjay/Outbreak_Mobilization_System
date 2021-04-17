/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Roles.PatientRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/1572021            @author palak       Added Patient Registration Panel
 * 
 */

public class PatientRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprisesJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    
    public PatientRegistrationJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        txtPatientAge = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtPatientMale = new javax.swing.JRadioButton();
        txtPatientFemale = new javax.swing.JRadioButton();
        lblPatientUsername = new javax.swing.JLabel();
        txtPatientUsername = new javax.swing.JTextField();
        lblPatientPassword = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtPatientAddress = new javax.swing.JTextField();
        lblPatientNumber = new javax.swing.JLabel();
        txtPatientNumber = new javax.swing.JTextField();
        lblPatientSymptoms1 = new javax.swing.JLabel();
        txtPatientSymptoms1 = new javax.swing.JTextField();
        lblPatientSymptoms2 = new javax.swing.JLabel();
        txtPatientSymptoms2 = new javax.swing.JTextField();
        lblPatientSymptoms3 = new javax.swing.JLabel();
        txtPatientSymptoms3 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Patient Registration Panel");

        lblPatientName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientName.setText("Name:");

        lblPatientAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientAge.setText("Age:");

        lblPatientGender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientGender.setText("Gender:");

        txtPatientMale.setText("Male");

        txtPatientFemale.setText("Female");

        lblPatientUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientUsername.setText("Username:");

        lblPatientPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientPassword.setText("Password:");

        lblPatientAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientAddress.setText("Address:");

        lblPatientNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientNumber.setText("Phone Number:");

        lblPatientSymptoms1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientSymptoms1.setText("Symptoms:");

        lblPatientSymptoms2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientSymptoms2.setText("Symptoms:");

        lblPatientSymptoms3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPatientSymptoms3.setText("Symptoms:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblPatientGender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtPatientMale, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPatientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtPatientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPatientSymptoms1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtPatientSymptoms1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPatientSymptoms2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtPatientSymptoms2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPatientSymptoms3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtPatientSymptoms3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(2, 2, 2)
                .addComponent(lblTitle)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientAge)
                    .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientGender)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPatientFemale)
                        .addComponent(txtPatientMale)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientUsername)
                    .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientPassword)
                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientAddress)
                    .addComponent(txtPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientNumber)
                    .addComponent(txtPatientNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientSymptoms1)
                    .addComponent(txtPatientSymptoms1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientSymptoms2)
                    .addComponent(txtPatientSymptoms2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientSymptoms3)
                    .addComponent(txtPatientSymptoms3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSubmit)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        Employee e = ecosystem.getEmployeeDirectory().createEmployee(txtPatientName.getText(), txtPatientAddress.getText(), txtPatientNumber.getText());
        if(e == null)
        {
            JOptionPane.showMessageDialog(null,"Patient " + txtPatientName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtPatientUsername.getText(), txtPatientPassword.getText(), e, new PatientRole());

        String sPatientGender = "";

        if(txtPatientMale.isSelected())
        {
            sPatientGender = txtPatientMale.getText();
        }
        else
        {
            sPatientGender = txtPatientFemale.getText();
        }

        if(ua != null)
        {
            Patient patient = ecosystem.getPatientDirectory().createPatient(txtPatientName.getText(), txtPatientAge.getText(), txtPatientUsername.getText(), txtPatientPassword.getText(),
                txtPatientAddress.getText(), txtPatientNumber.getText(), sPatientGender, txtPatientSymptoms1.getText(), txtPatientSymptoms2.getText(), txtPatientSymptoms3.getText());
            JOptionPane.showMessageDialog(null, "Patient account created successfully for " + patient.getPatientName());
        }
        else
        {
            ecosystem.getEmployeeDirectory().deleteEmployee(e);
            JOptionPane.showMessageDialog(null,"Username " + txtPatientUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientNumber;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientSymptoms1;
    private javax.swing.JLabel lblPatientSymptoms2;
    private javax.swing.JLabel lblPatientSymptoms3;
    private javax.swing.JLabel lblPatientUsername;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtPatientAddress;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JRadioButton txtPatientFemale;
    private javax.swing.JRadioButton txtPatientMale;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientNumber;
    private javax.swing.JTextField txtPatientPassword;
    private javax.swing.JTextField txtPatientSymptoms1;
    private javax.swing.JTextField txtPatientSymptoms2;
    private javax.swing.JTextField txtPatientSymptoms3;
    private javax.swing.JTextField txtPatientUsername;
    // End of variables declaration//GEN-END:variables
}