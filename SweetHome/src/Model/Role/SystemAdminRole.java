
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JFrame;
import ui.AdministrativeRole.AdminWorkAreaJFrame;



/**
 *
 * @author Ma2017
 */
public class SystemAdminRole extends Role {

    public SystemAdminRole() {
        this.type = RoleType.SystemAdmin;
    }

    
     @Override
    public JFrame createWorkArea(EcoSystem ecosys, Network network,Enterprise enterprise, Organization org, UserAccount useraccount) {
      
  
        return new AdminWorkAreaJFrame(ecosys,useraccount);
        
    }

}
