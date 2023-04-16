
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import ui.AdministrativeRole.AdminWorkAreaJFrame;

/**
 *
 * @author Ma2017
 */
public abstract class Role {
    
    //define different roles
        public enum RoleType {
            
        OrphanRegister("Orphan Register"),
        OrphanManager("Orphan Manager"),
        Doctor("Doctor"),
        Pharmacist("Pharmacist"),
        Adopter("Adopter"),
        AdoptionManager("Adoption Manager"), 
        VolunteerManeger("Volunteer Manager"),
        Volunteer("Volunteer"),
        SystemAdmin ("System Admin");

        private final String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;
    
    public abstract JFrame createWorkArea(EcoSystem ecosystem, Network network, Enterprise enterprise, UserAccount useraccount);

    public JPanel createAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new AdminWorkAreaJFrame(userProcessContainer, account, ecosystem);
    }
    
    @Override
    public String toString() {
        return this.type.getValue();
    }    
    
}