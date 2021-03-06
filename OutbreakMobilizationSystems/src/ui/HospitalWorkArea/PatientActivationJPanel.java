/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.Roles.PatientRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palak
 */
public class PatientActivationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientActivationJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private OrganizationDirectory organizationDirectory;
    
    public PatientActivationJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
     
        this.business = system;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof PatientRegistrationRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = workRequest;
                row[1] = ((PatientRegistrationRequest) workRequest).getStatus();
                row[2] = ((PatientRegistrationRequest) workRequest).getPatientUsername();
                row[3] = ((PatientRegistrationRequest) workRequest).getPatientName();
                row[4] = ((PatientRegistrationRequest) workRequest).getSymptom1();
                row[5] = ((PatientRegistrationRequest) workRequest).getPatientEmailId();
                row[6] = ((PatientRegistrationRequest) workRequest).getPatientAddress();
                row[7] = ((PatientRegistrationRequest) workRequest).getOrgType();
                row[8] = ((PatientRegistrationRequest) workRequest).getNetwork();

                model.addRow(row);
            }
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageAssistant = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageAssistant.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblManageAssistant.setText("Manage Patient Registration Requests");
        add(lblManageAssistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 950, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 110, 50));

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(25, 56, 82));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request #", "Status", "UserName", "Name", "Symptoms", "Email ID", "City", "Organization Type", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setRowHeight(50);
        workRequestJTable.setRowMargin(0);
        workRequestJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 1210, 290));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(25, 56, 82));
        btnSubmit.setText("Activate Patient");
        btnSubmit.setOpaque(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 780, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospitalnew.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diagnew.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow >= 0) {
            PatientRegistrationRequest request = (PatientRegistrationRequest) workRequestJTable.getValueAt(selectedRow, 0);

                Organization org = organizationDirectory.createOrganization(request.getOrgType());
                Employee emp = org.getEmployeeDirectory().createEmployee(request.getPatientName());
                UserAccount ua1 = org.getUserAccountDirectory().createUserAccount(request.getPatientUsername(), request.getPatientPassword(), emp, new PatientRole());

            request.setStatus("Activated");
            JOptionPane.showMessageDialog(null, "User account has been activated successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Patient to activate");
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAssistant;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
