/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DiagnosticianRole.DiagnosticianJPanel;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/13/2021            @author nakul       Added Diagnostician role
 * 04/14/2021            @author palak       Added UserAccount and constructor
 */

public class DiagnosticianRole extends Roles{

    private RoleType roleType;
    public DiagnosticianRole() {
        RoleType roleType = RoleType.Diagnostician;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new DiagnosticianJPanel(userProcessContainer, system, network, enterprise);
    }
}
