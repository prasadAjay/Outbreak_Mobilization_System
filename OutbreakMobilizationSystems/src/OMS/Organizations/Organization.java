///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
package OMS.Organizations;


import OMS.Employee.EmployeeDirectory;
import OMS.Roles.Roles;
import OMS.UserAccount.UserAccountDirectory;
import OMS.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 * @author ajayp
 * @author nakul
 * @author palak
 * 
 * Revision History:
 * 
 * Date(MM/DD/YYYY)      Author              Comment
 * 04/12/2021            @author palak       Added Organization
 * 04/13/2021            @author palak       Added enum Types
 * 
 */

public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Administration Organization"), Hospital("HospitalInventory Organization"), Laboratories("Laboratories Organization"),
        Manufacturer("Manufacturer Organization"), PharmacyCatalog("PharmacyCatalog Organization"), PharmacyDistribution("PharmacyDistribution Organization"),
        SampleCollections("SampleCollections Organization"), SupplyChain("SupplyChain Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Roles> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}