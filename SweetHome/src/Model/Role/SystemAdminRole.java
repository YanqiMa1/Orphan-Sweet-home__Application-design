/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdministrativeRole.AdminWorkAreaJFrame;


/**
 *
 * @author Jiale Lyu
 */
public class SystemAdminRole extends Role {

    public SystemAdminRole() {
        this.type = RoleType.SystemAdmin;
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new AdminWorkAreaJFrame(userProcessContainer, account, ecosystem);
    }

}
