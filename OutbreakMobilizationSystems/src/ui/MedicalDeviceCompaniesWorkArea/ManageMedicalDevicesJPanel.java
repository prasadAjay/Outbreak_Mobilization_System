/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.MedicalDeviceCompaniesWorkArea;

import Business.EcoSystem;
import Business.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author nakul       Added ManageMedicalDevices JPanel
 * 04/14/2021            @author palak       Added UserAccount
 */
public class ManageMedicalDevicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicalDevicesJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount user;
    Network network;
    
    public ManageMedicalDevicesJPanel(JPanel userProcessContainer, UserAccount user, Network network, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.user = user;
        this.network = network;
        this.ecosystem=ecosystem;
        //populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        maxIcon = new javax.swing.JPanel();
        buttonClose = new javax.swing.JPanel();
        closeBtn = new javax.swing.JLabel();
        buttonMax = new javax.swing.JPanel();
        maxBtn = new javax.swing.JLabel();
        buttonMin = new javax.swing.JPanel();
        minBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sideMenu = new javax.swing.JPanel();
        menuOption = new javax.swing.JPanel();
        lineHideMenu = new javax.swing.JPanel();
        hideMenu = new javax.swing.JPanel();
        backMenu = new javax.swing.JLabel();
        lineSetting = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        homeBtn = new javax.swing.JLabel();
        slidingMenu = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(51, 51, 51));
        header.setPreferredSize(new java.awt.Dimension(800, 50));
        header.setLayout(new java.awt.BorderLayout());

        maxIcon.setBackground(new java.awt.Color(51, 51, 51));
        maxIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonClose.setBackground(new java.awt.Color(51, 51, 51));
        buttonClose.setLayout(new java.awt.BorderLayout());

        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_close_window_32px.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        buttonClose.add(closeBtn, java.awt.BorderLayout.CENTER);

        maxIcon.add(buttonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        buttonMax.setBackground(new java.awt.Color(51, 51, 51));
        buttonMax.setLayout(new java.awt.BorderLayout());

        maxBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_maximize_window_32px_3.png"))); // NOI18N
        maxBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxBtnMouseExited(evt);
            }
        });
        buttonMax.add(maxBtn, java.awt.BorderLayout.CENTER);

        maxIcon.add(buttonMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        buttonMin.setBackground(new java.awt.Color(51, 51, 51));
        buttonMin.setLayout(new java.awt.BorderLayout());

        minBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_macos_minimize_32px.png"))); // NOI18N
        minBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minBtnMouseExited(evt);
            }
        });
        buttonMin.add(minBtn, java.awt.BorderLayout.CENTER);

        maxIcon.add(buttonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        header.add(maxIcon, java.awt.BorderLayout.LINE_END);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("OutBreak Mobilization Systems ");
        header.add(jLabel2, java.awt.BorderLayout.CENTER);

        add(header, java.awt.BorderLayout.PAGE_START);

        sideMenu.setPreferredSize(new java.awt.Dimension(270, 450));
        sideMenu.setLayout(new java.awt.BorderLayout());

        menuOption.setBackground(new java.awt.Color(51, 51, 51));
        menuOption.setPreferredSize(new java.awt.Dimension(50, 450));
        menuOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineHideMenu.setBackground(new java.awt.Color(51, 51, 51));
        lineHideMenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout lineHideMenuLayout = new javax.swing.GroupLayout(lineHideMenu);
        lineHideMenu.setLayout(lineHideMenuLayout);
        lineHideMenuLayout.setHorizontalGroup(
            lineHideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineHideMenuLayout.setVerticalGroup(
            lineHideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuOption.add(lineHideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        hideMenu.setBackground(new java.awt.Color(51, 51, 51));
        hideMenu.setLayout(new java.awt.BorderLayout());

        backMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backbutton.png"))); // NOI18N
        backMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMenuMouseExited(evt);
            }
        });
        hideMenu.add(backMenu, java.awt.BorderLayout.CENTER);

        menuOption.add(hideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        lineSetting.setBackground(new java.awt.Color(51, 51, 51));
        lineSetting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout lineSettingLayout = new javax.swing.GroupLayout(lineSetting);
        lineSetting.setLayout(lineSettingLayout);
        lineSettingLayout.setHorizontalGroup(
            lineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        lineSettingLayout.setVerticalGroup(
            lineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        menuOption.add(lineSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setLayout(new java.awt.BorderLayout());

        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_32px.png"))); // NOI18N
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });
        home.add(homeBtn, java.awt.BorderLayout.CENTER);

        menuOption.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 50));

        sideMenu.add(menuOption, java.awt.BorderLayout.LINE_START);

        slidingMenu.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout slidingMenuLayout = new javax.swing.GroupLayout(slidingMenu);
        slidingMenu.setLayout(slidingMenuLayout);
        slidingMenuLayout.setHorizontalGroup(
            slidingMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        slidingMenuLayout.setVerticalGroup(
            slidingMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        sideMenu.add(slidingMenu, java.awt.BorderLayout.CENTER);

        add(sideMenu, java.awt.BorderLayout.LINE_START);

        dashboard.setBackground(new java.awt.Color(153, 153, 0));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(dashboard, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
    }//GEN-LAST:event_closeBtnMouseExited

    private void maxBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxBtnMouseClicked
      
    }//GEN-LAST:event_maxBtnMouseClicked

    private void maxBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxBtnMouseEntered
    }//GEN-LAST:event_maxBtnMouseEntered

    private void maxBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxBtnMouseExited
    }//GEN-LAST:event_maxBtnMouseExited

    private void minBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseClicked
        
    }//GEN-LAST:event_minBtnMouseClicked

    private void minBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseEntered
    }//GEN-LAST:event_minBtnMouseEntered

    private void minBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseExited
    }//GEN-LAST:event_minBtnMouseExited

    private void backMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuMouseClicked
        
    }//GEN-LAST:event_backMenuMouseClicked

    private void backMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuMouseEntered
    }//GEN-LAST:event_backMenuMouseEntered

    private void backMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMenuMouseExited
    }//GEN-LAST:event_backMenuMouseExited

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
    }//GEN-LAST:event_homeBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backMenu;
    private javax.swing.JPanel buttonClose;
    private javax.swing.JPanel buttonMax;
    private javax.swing.JPanel buttonMin;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel header;
    private javax.swing.JPanel hideMenu;
    private javax.swing.JPanel home;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel lineHideMenu;
    private javax.swing.JPanel lineSetting;
    private javax.swing.JLabel maxBtn;
    private javax.swing.JPanel maxIcon;
    private javax.swing.JPanel menuOption;
    private javax.swing.JLabel minBtn;
    private javax.swing.JPanel sideMenu;
    private javax.swing.JPanel slidingMenu;
    // End of variables declaration//GEN-END:variables
}
