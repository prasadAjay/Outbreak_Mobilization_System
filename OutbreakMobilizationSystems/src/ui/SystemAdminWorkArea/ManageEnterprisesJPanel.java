/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
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
 * 04/23/2021            @author nakul      UI

 */

public class ManageEnterprisesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterprisesJPanel
     */
    private JPanel userProcessContainer;
    
    private EcoSystem ecosystem;
    private Network network;
    

    public ManageEnterprisesJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.network = network;
        populateEnterpriseTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void populateEnterpriseTable() {
        DefaultTableModel enterpriseModel = (DefaultTableModel) tblEnterpriseInformation.getModel();
        enterpriseModel.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
                enterpriseModel.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        comboNetwork.removeAllItems();
        comboEnterpriseType.removeAllItems();
        for (Network network : ecosystem.getNetworkList()) {
            comboNetwork.addItem(network);
        }
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            comboEnterpriseType.addItem(type);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnterpriseInformation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterpriseInformation = new javax.swing.JTable();
        btnAddEnterprise = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblANewEnterprise = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblEnterpriseType = new javax.swing.JLabel();
        comboEnterpriseType = new javax.swing.JComboBox();
        comboNetwork = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        btnCreateEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterpriseInformation.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblEnterpriseInformation.setText("Enterprise Information");
        add(lblEnterpriseInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 570, -1));

        tblEnterpriseInformation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblEnterpriseInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEnterpriseInformation.setRowHeight(50);
        jScrollPane1.setViewportView(tblEnterpriseInformation);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 990, 230));

        btnAddEnterprise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddEnterprise.setText("Add Enterprise");
        btnAddEnterprise.setOpaque(false);
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });
        add(btnAddEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 250, 50));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 370, 40));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        lblANewEnterprise.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblANewEnterprise.setText("Add a new Enterprise");
        add(lblANewEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        lblNetwork.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNetwork.setText("Network:");
        add(lblNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        lblEnterpriseType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblEnterpriseType.setText("Enterprise Type:");
        add(lblEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        comboEnterpriseType.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        comboEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboEnterpriseType, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 370, 40));

        comboNetwork.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        comboNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 370, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, 40));

        btnCreateEmployee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.setOpaque(false);
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 600, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manageenterprise.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1960, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        // TODO add your handling code here:
        Network network = (Network) comboNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) comboEnterpriseType.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = txtName.getText();
        if (!name.isEmpty()) {
            Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
            JOptionPane.showMessageDialog(null, "Enterprise created sucessfully!");
            txtName.setText("");
            populateEnterpriseTable();
        } else {
            JOptionPane.showMessageDialog(null, "Enter correct Enterprise Name");
        }
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        // TODO add your handling code here:
            ManageEnterpriseAdminJPanel ManageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem);
            userProcessContainer.add("ManageEnterpriseAdminJPanel", ManageEnterpriseAdminJPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JComboBox comboEnterpriseType;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblANewEnterprise;
    private javax.swing.JLabel lblEnterpriseInformation;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JTable tblEnterpriseInformation;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
