/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.LabAssistantRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.SendTestSampleRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajayp
 */
public class LabAssistantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Network network;
    Enterprise enterprise;

    public LabAssistantJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Network network, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.network = network;
        this.enterprise = enterprise;
        populateSamplesProcessTable();
        populateHospitalTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblManageSamples = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSamplesProcessed = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHospitals = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        lblManageSamples.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageSamples.setText("Manage Lab Samples");

        tblSamplesProcessed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Patient Name", "Samples", "Hospital Name", "Assigned Lab Assistant", "Diagnostics Center", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSamplesProcessed);

        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAssign.setText("Assign Hospital");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        tblHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Hospital Name", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHospitals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(lblManageSamples, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnAssign)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblManageSamples)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedHospitalRow = tblHospitals.getSelectedRow();
        int selectedSamplesRow = tblSamplesProcessed.getSelectedRow();
        PatientRegistrationRequest patientRegistrationRequest = (PatientRegistrationRequest) tblSamplesProcessed.getValueAt(selectedSamplesRow, 0);
        String hospitalName = (String) tblHospitals.getValueAt(selectedHospitalRow, 0);
        System.out.println("hospitalName" +hospitalName);
        if (selectedHospitalRow >= 0 && selectedSamplesRow >= 0) {
            String msg = JOptionPane.showInputDialog("Additional Information");
            patientRegistrationRequest.setHospitalName(hospitalName);
            patientRegistrationRequest.setStatus("Hospital Assigned");
            patientRegistrationRequest.setMessage(msg);
            JOptionPane.showMessageDialog(null, "Hospital Assignment Successful");
            populateSamplesProcessTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Hospital to send the samples!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void populateSamplesProcessTable() {
        DefaultTableModel samplesModel = (DefaultTableModel) tblSamplesProcessed.getModel();
        samplesModel.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientRegistrationRequest) {
                Object[] row = new Object[samplesModel.getColumnCount()];
                row[0] = ((PatientRegistrationRequest) wr);
                row[1] = ((PatientRegistrationRequest) wr).getPatientName();
                row[2] = ((PatientRegistrationRequest) wr).getSampleId();
                row[3] = ((PatientRegistrationRequest) wr).getHospitalName();
                row[4] = ((PatientRegistrationRequest) wr).getLabAssistant();
                row[5] = ((PatientRegistrationRequest) wr).getDiagnostician();
                row[6] = ((PatientRegistrationRequest) wr).getStatus();
                row[7] = ((PatientRegistrationRequest) wr).getMessage();
                samplesModel.addRow(row);
            }
        }
    }

    private void populateHospitalTable() {
        DefaultTableModel hospitalModel = (DefaultTableModel) tblHospitals.getModel();
        hospitalModel.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    Object[] row = new Object[2];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    hospitalModel.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblManageSamples;
    private javax.swing.JTable tblHospitals;
    private javax.swing.JTable tblSamplesProcessed;
    // End of variables declaration//GEN-END:variables
}
