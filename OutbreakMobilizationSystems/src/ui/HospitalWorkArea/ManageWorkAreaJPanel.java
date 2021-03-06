/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/19/2021            @author ajayp       Added ManageWorkAreaJPanel
 */

public class ManageWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprisesJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    Enterprise enterprise;
    Timer timer;
    UserAccount userAccount;

    public ManageWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                //Time in 12Hrs Format
                Date date1 = new Date();
                DateFormat timeFormat1 = new SimpleDateFormat("hh:mm:ss");
                String time1 = timeFormat1.format(date1);
                time_txt.setText(time1);
                
                //Todays Date
                Date date2 = new Date();
                DateFormat timeFormat2 = new SimpleDateFormat("MM/dd/yyyy");
                String time2 = timeFormat2.format(date2);
                date_txt.setText(time2);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblANewEnterprise = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        btnManageOrganizations = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        btnPatientActication = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblANewEnterprise.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblANewEnterprise.setText("Welcome Hospital Manager");
        add(lblANewEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 40, 160, 30));

        time_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 40, 150, 30));

        btnManageOrganizations.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnManageOrganizations.setText("Manage Organizations");
        btnManageOrganizations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationsActionPerformed(evt);
            }
        });
        add(btnManageOrganizations, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 427, 330, 50));

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 507, 330, 50));

        userJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 587, 330, 50));

        btnPatientActication.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPatientActication.setText("Activate Patients");
        btnPatientActication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActicationActionPerformed(evt);
            }
        });
        add(btnPatientActication, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospitalnew.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationsActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationsActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void btnPatientActicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActicationActionPerformed
        // TODO add your handling code here:
        PatientActivationJPanel patientActivationJPanel = new PatientActivationJPanel(userProcessContainer, userAccount, enterprise, ecosystem);
        userProcessContainer.add("PatientActivationJPanel", patientActivationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientActicationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrganizations;
    private javax.swing.JButton btnPatientActication;
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblANewEnterprise;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JLabel time_txt;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
