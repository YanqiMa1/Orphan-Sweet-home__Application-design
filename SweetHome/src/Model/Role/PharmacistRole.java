/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.MedicalCareEnterprise;
import Model.Organization.Organization;
import Model.Organization.PharmacyOrganization;
import Model.UserAccount.UserAccount;
import UI.Pharmacist.PharmacistWorkAreaJFrame;
import javax.swing.JPanel;



/**
 *
 * @author Yifei Chen
 */
public class PharmacistRole extends Role{

    public PharmacistRole() {
        
        this.type = RoleType.Pharmacist;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        
        this.type = RoleType.Pharmacist;
        
        return new PharmacistWorkAreaJFrame(userProcessContainer, account, (PharmacyOrganization) organization, 
                
                (MedicalCareEnterprise) enterprise, network, ecosystem);
    }

}