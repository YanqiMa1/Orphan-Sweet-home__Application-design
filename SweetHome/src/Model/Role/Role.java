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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem Ecosystem);

    public JPanel createAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new AdminWorkAreaJFrame(userProcessContainer, account, ecosystem);
    }
    
    @Override
    public String toString() {
        return this.type.getValue();
    }    
    
}