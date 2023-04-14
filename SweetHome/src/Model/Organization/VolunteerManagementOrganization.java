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

public class VolunteerManagementOrganization extends Organization{

    public VolunteerManagementOrganization(String name) {
        super(name, Organization.Type.VolunteerManagement);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new VolunteerManagerRole());
        return roles;
    }
    
}