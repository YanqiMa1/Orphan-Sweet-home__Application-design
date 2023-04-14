/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.OrphanRegisterRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class OrphanRegisterOrganization extends Organization {

    public OrphanRegisterOrganization(String name) {
        super(name, Organization.Type.OrphanRegister);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrphanRegisterRole());
        return roles;
    }

}
