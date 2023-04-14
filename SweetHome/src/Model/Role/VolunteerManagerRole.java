
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.VolunteerEnterprise;
import Model.Organization.Organization;
import Model.Organization.VolunteerManagementOrganization;
import Model.UserAccount.UserAccount;
import UI.VolunteerManagement.VolunteerManagerJFrame;
import javax.swing.JPanel;



/**
 *
 * @author Ma2017
 */
public class VolunteerManagerRole extends Role {

    public VolunteerManagerRole() {
        this.type = RoleType.VolunteerManeger;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        
        this.type = RoleType.VolunteerManeger;
        
        return new VolunteerManagerJFrame(userProcessContainer, account, (VolunteerManagementOrganization) organization,
                
                (VolunteerEnterprise) enterprise, network, ecosystem);
    }


}
