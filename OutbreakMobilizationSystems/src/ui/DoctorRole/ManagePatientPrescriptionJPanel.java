/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.PharmacyCatalogOrganization;
import Business.WorkQueue.MedicineWorkRequest;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author palak
 */
public class ManagePatientPrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientPrescriptionJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    ArrayList<Medicine> medicienList = new ArrayList<>();
    PharmacyCatalogOrganization pharmacyCatalogOrganization;
    Enterprise enterpise;
    
    public ManagePatientPrescriptionJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Organization organization, Enterprise enterpise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterpise = enterpise;
        
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if(o instanceof PharmacyCatalogOrganization)
                    {
                        this.pharmacyCatalogOrganization = (PharmacyCatalogOrganization) o;
                    }
                }
            }
        }
        populateMedicine();
        populatePrescription();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void populatePatientTable(){
        DefaultTableModel samplesModel = (DefaultTableModel) tblPatientDetails.getModel();
        samplesModel.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof HospitalEnterprise) {
                    for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                        if (wr instanceof PatientRegistrationRequest) {
                            Object[] row = new Object[samplesModel.getColumnCount()];
                            row[0] = ((PatientRegistrationRequest) wr);
                            row[1] = ((PatientRegistrationRequest) wr).getPatientName();
                            row[2] = ((PatientRegistrationRequest) wr).getSymptom1();
                            row[3] = ((PatientRegistrationRequest) wr).getLabAssistant();
                            row[4] = ((PatientRegistrationRequest) wr).getCareTaker();
                            row[4] = ((PatientRegistrationRequest) wr).getRequestDate();
                            row[5] = ((PatientRegistrationRequest) wr).getStatus();
                            row[6] = ((PatientRegistrationRequest) wr).getMessage();
                            samplesModel.addRow(row);
                        }
                    }
                }
            }
        }
    }
    
    public void populateMedicine()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblMedicine.getModel();
        dtm.setRowCount(0);
        for(Medicine medicine : pharmacyCatalogOrganization.getMedicineDirectory().getMedicineList())
        {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = medicine.getMedId();
            row[1] = medicine.getMedName();
            dtm.addRow(row);
        }
    }
    
    public void populatePrescription()
    {
        DefaultTableModel dtm = (DefaultTableModel)tblPrescription.getModel();
        dtm.setRowCount(0);
        if(medicienList != null)
        {
            btnDeleteMed.setEnabled(true);
            btnConfirmMed.setEnabled(true);
            int count = 1;
            for(Medicine medicine : medicienList)
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = count;
                row[1] = medicine;
                dtm.addRow(row);
                count++;
            }
        }
        if(tblPrescription.getRowCount() <= 0)
        {
            btnConfirmMed.setEnabled(false);
            btnDeleteMed.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        btnAddMedicine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        btnDeleteMed = new javax.swing.JButton();
        btnConfirmMed = new javax.swing.JButton();
        lblManageAssistant = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatientDetails = new javax.swing.JTable();

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Id", "Medicine Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicine);

        btnAddMedicine.setText("Add Medicine");
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });

        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Id", "Medicine Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrescription);

        btnDeleteMed.setText("Remove Medicine");
        btnDeleteMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMedActionPerformed(evt);
            }
        });

        btnConfirmMed.setText("Confirm Prescription");
        btnConfirmMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmMedActionPerformed(evt);
            }
        });

        lblManageAssistant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblManageAssistant.setText("Prescripe Medicines to Patients");

        tblPatientDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Patient Name", "Symptoms", "Assigned Lab Assistant", "Assigned Care Taker", "Created Date", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPatientDetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(lblManageAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteMed))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirmMed)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblManageAssistant)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddMedicine)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteMed)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmMed)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblMedicine.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnAddMedicine.setEnabled(true);
        }
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicine.getSelectedRow();
        if (selectedRow >= 0)
        {
            Medicine medicine = (Medicine) tblMedicine.getValueAt(selectedRow, 1);
            medicienList.add(medicine);
            JOptionPane.showMessageDialog(null, "Medicine " + medicine.getMedName()+ " added to cart successfully!");
            populatePrescription();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select Medicine to Add!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void btnDeleteMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMedActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tblPrescription.getSelectedRow();
        if (selectedRow1 >= 0)
        {
            Medicine medicine = (Medicine) tblPrescription.getValueAt(selectedRow1, 1);
            medicienList.remove(medicine);
            JOptionPane.showMessageDialog(null, "Medicine " + medicine.getMedName()+ " removed from prescription Successfully!");
            populatePrescription();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select Medicine to remove!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnDeleteMedActionPerformed

    private void btnConfirmMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmMedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatientDetails.getSelectedRow();
        Employee employee = (Employee)tblPatientDetails.getValueAt(selectedRow, 1);
        
        MedicineWorkRequest medicineWorkRequest = new MedicineWorkRequest();
        medicineWorkRequest.setPatient(employee);
        medicineWorkRequest.setMedicineList(medicienList);
        medicineWorkRequest.setStatus("Medicine Added");
        boolean bSuccess = false;
        
        for (Network network1 : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Hospital) {
                    if (enterprise.getWorkQueue() == null) {
                        enterprise.setWorkQueue(new WorkQueue());
                    }
                    enterprise.getWorkQueue().getWorkRequestList().add(medicineWorkRequest);
                    bSuccess = true;
                }
            }
        }
        
        if(bSuccess == true)
        {
            JOptionPane.showMessageDialog(null, "Prescription sent to patient succesfully!");
            medicienList.clear();
            populateMedicine();
            populatePrescription();
        }
        
    }//GEN-LAST:event_btnConfirmMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnConfirmMed;
    private javax.swing.JButton btnDeleteMed;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblManageAssistant;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTable tblPatientDetails;
    private javax.swing.JTable tblPrescription;
    // End of variables declaration//GEN-END:variables
}
