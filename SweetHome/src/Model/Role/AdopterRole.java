
package Model.Role;
import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.AdoptionEnterprise;
import Model.Enterprise.Enterprise;
import Model.Organization.AdopterOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Adopter.AdopterWorkAreaJFrame;



/**
 *
 * @author fanyesun
 */
public class AdopterRole extends Role {

    public AdopterRole() {
        this.type = RoleType.Adopter;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Adopter;
        return new AdopterWorkAreaJFrame(userProcessContainer, account, (AdopterOrganization) organization, (AdoptionEnterprise) enterprise, network, ecosystem);
    }


}
