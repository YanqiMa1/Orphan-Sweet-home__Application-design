
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanRegisterOrganization;
import Model.UserAccount.UserAccount;
import UI.OrphanRegister.OrphanRegisterJFrame;
import javax.swing.JPanel;


/**
 *
 * @author Ma2017
 */
public class OrphanRegisterRole extends Role {

    public OrphanRegisterRole() {
        this.type = RoleType.OrphanRegister;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.OrphanRegister;
        return new OrphanRegisterJFrame(userProcessContainer, account, (OrphanRegisterOrganization) organization, (OrphanShelterEnterprise) enterprise, network, ecosystem);
    }

}
