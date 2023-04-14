
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Organization.AuthorityOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Authority.AuthorityWorkAreaJFrame;


/**
 *
 * @author Ma2017
 */
public class AuthorityRole extends Role {

    public AuthorityRole() {
        this.type = RoleType.AdoptionManager;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.AdoptionManager;
        return new AuthorityWorkAreaJFrame(userProcessContainer, account, (AuthorityOrganization) organization, (AdoptionEnterprise) enterprise, network, ecosystem);
    }


}
