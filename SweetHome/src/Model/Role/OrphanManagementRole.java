
package Model.Role;

import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanManagementOrganization;
import Model.UserAccount.UserAccount;
import UI.OrphanManagement.OrphanManagerJFrame;
import javax.swing.JPanel;


/**
 *
 * @author Ma2017
 */
public class OrphanManagementRole extends Role {
    
    public OrphanManagementRole() {
        this.type = Role.RoleType.OrphanManager;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.OrphanManager;
        return new OrphanManagerJFrame(userProcessContainer, account, (OrphanManagementOrganization) organization, (OrphanShelterEnterprise) enterprise, network, ecosystem);
    }
}
