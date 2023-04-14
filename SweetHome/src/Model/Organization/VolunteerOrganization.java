/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class VolunteerOrganization extends Organization{

    public VolunteerOrganization(String name) {
        super(name, Organization.Type.Volunteer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
}
