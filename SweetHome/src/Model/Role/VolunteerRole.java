
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.VolunteerEnterprise;
import Model.Organization.Organization;
import Model.Organization.VolunteerOrganization;
import Model.UserAccount.UserAccount;
import UI.Volunteer.VolunteerJFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ma2017
 */
public class VolunteerRole extends Role {

    public VolunteerRole() {
        
        this.type = RoleType.Volunteer;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
            
            Enterprise enterprise, Network network, EcoSystem ecosystem) {
        
        
        this.type = RoleType.Volunteer;
        
        return new VolunteerJFrame(userProcessContainer, account, (VolunteerOrganization) organization,
                
                (VolunteerEnterprise) enterprise, network, ecosystem);
    }


}
