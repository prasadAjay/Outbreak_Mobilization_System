/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OMS.Enterprise;

import OMS.Roles.Roles;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 
 * 
 */

public class MedicalDeviceCompaniesEnterprise extends Enterprise{
    
    public MedicalDeviceCompaniesEnterprise(String name){
        super(name,Enterprise.EnterpriseType.MedicalDeviceCompanies);
    }
    @Override
    public ArrayList<Roles> getSupportedRole() {
        return null;
    } 
}