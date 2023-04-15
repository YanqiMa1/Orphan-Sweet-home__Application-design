
package Model.Role;

import Model.EcoSystem.EcoSystem;
import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Enterprise.MedicalCareEnterprise;
import Model.Organization.DoctorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UI.Doctor.DoctorWorkAreaJFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ma2017
 */
public class DoctorRole extends Role {

    public DoctorRole() {
        this.type = RoleType.Doctor;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
            Enterprise enterprise, Network network, EcoSystem ecosystem) {

        this.type = RoleType.Doctor;

        return new DoctorWorkAreaJFrame(userProcessContainer, account, (DoctorOrganization) organization,
                (MedicalCareEnterprise) enterprise, network, ecosystem);
    }

}
