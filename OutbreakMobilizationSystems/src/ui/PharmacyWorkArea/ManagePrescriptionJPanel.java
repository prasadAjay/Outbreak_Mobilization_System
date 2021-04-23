/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PharmacyWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author nakul       Added ManageMedicines JPanel
 * 04/14/2021            @author palak       Added UserAccount
 */
public class ManagePrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePrescriptionJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Enterprise enterprise;
    
    public ManagePrescriptionJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        populatePharmacistTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populatePharmacistTable() {
        DefaultTableModel medicinesModel = (DefaultTableModel) tblProcessMedicines.getModel();
        medicinesModel.setRowCount(0);
        System.out.println("enterprise" + enterprise);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof PatientRegistrationRequest) {
                Object[] row = new Object[medicinesModel.getColumnCount()];
                row[0] = ((PatientRegistrationRequest) wr);
                row[1] = ((PatientRegistrationRequest) wr).getPatientName();
                row[2] = ((PatientRegistrationRequest) wr).getDoctor();
                row[3] = ((PatientRegistrationRequest) wr).getCareTaker();
                row[4] = ((PatientRegistrationRequest) wr).getPrescription();
                row[5] = ((PatientRegistrationRequest) wr).getQuantity();
                row[6] = ((PatientRegistrationRequest) wr).getStatus();
                row[7] = ((PatientRegistrationRequest) wr).getMessage();
                medicinesModel.addRow(row);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMedicinesToPatients = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcessMedicines = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();

        lblMedicinesToPatients.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMedicinesToPatients.setText("Process the Medicines to Patients");

        tblProcessMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor Name", "Care Taker Name", "Prescription", "Quantity", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProcessMedicines);

        btnProcess.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(lblMedicinesToPatients))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addComponent(btnProcess)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblMedicinesToPatients)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnProcess)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProcessMedicines.getSelectedRow();
        PatientRegistrationRequest patientRegistrationRequest = (PatientRegistrationRequest) tblProcessMedicines.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
            if (patientRegistrationRequest.getStatus().equalsIgnoreCase("Pick up for Delivery")) {
                String msg = JOptionPane.showInputDialog("Additional Information");
                patientRegistrationRequest.setStatus("Medicines given to the Care Taker");
                patientRegistrationRequest.setMessage(msg);
                populatePharmacistTable();
            } else {
                JOptionPane.showMessageDialog(null, "The medicines already given.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select the prescription to given the medicines.");
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedicinesToPatients;
    private javax.swing.JTable tblProcessMedicines;
    // End of variables declaration//GEN-END:variables
}
