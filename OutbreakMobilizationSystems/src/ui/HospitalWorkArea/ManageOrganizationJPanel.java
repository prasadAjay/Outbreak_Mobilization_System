/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalWorkArea;

import Business.Organizations.HospitalInvetoryOrganization;
import Business.Organizations.LaboratoriesOrganization;
import Business.Organizations.ManufacturerOrganization;
import Business.Organizations.Organization;
import Business.Organizations.Organization.Type;
import Business.Organizations.OrganizationDirectory;
import Business.Organizations.PharmacyCatalogOrganization;
import Business.Organizations.PharmacyDistributionOrganization;
import Business.Organizations.SampleCollectionsOrganization;
import Business.Organizations.SupplyChainOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setRowHeight(50);
        organizationJTable.setRowMargin(0);
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 1040, 240));

        addJButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.setOpaque(false);
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 460, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Organization Type :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Manage Organization");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 530, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hospitalnew.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        int checkFlag = 1;
        
        if(type.getValue().equals(Type.Hospital.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof HospitalInvetoryOrganization){
              JOptionPane.showMessageDialog(null, "Hospital Inventory Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.Laboratories.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof LaboratoriesOrganization){
              JOptionPane.showMessageDialog(null, "Laboratories Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.Manufacturer.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof ManufacturerOrganization){
              JOptionPane.showMessageDialog(null, "Manufacturer Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.PharmacyCatalog.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof PharmacyCatalogOrganization){
              JOptionPane.showMessageDialog(null, "PharmacyCatalog Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.PharmacyDistribution.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof PharmacyDistributionOrganization){
              JOptionPane.showMessageDialog(null, "PharmacyDistribution Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.SampleCollections.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof SampleCollectionsOrganization){
              JOptionPane.showMessageDialog(null, "SamplCollections Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
       if(type.getValue().equals(Type.SupplyChain.getValue())){
           for (Organization organization : directory.getOrganizationList()){
           if (organization instanceof SupplyChainOrganization){
              JOptionPane.showMessageDialog(null, "Supply Chain Organization exists"); 
              checkFlag = 0;
               break;
           }  } 
       }
       
        if (checkFlag==1){
                directory.createOrganization(type);
        populateTable();
           }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
