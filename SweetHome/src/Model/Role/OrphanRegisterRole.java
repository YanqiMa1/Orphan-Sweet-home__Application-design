
package Model.Role;


import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Organization.OrphanManagementOrganization;
import Model.Organization.OrphanRegisterOrganization;
import Model.UserAccount.UserAccount;
import UI.OrphanManagement.OrphanManagerJFrame;
import UI.OrphanRegister.OrphanRegisterJFrame;
import javax.swing.JFrame;
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
    public JFrame createWorkArea(EcoSystem ecosys, Network network, Enterprise enterprise, Organization org, UserAccount useraccount) {
        return new OrphanManagerJFrame(ecosys, network, (OrphanShelterEnterprise) enterprise, (OrphanRegisterOrganization) org, useraccount);
    }

}
