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
public class AdoptionOperationOrganization extends Organization{
    public AdoptionOperationOrganization(String nameAdopter) {
        super(nameAdopter, Organization.Type.AdoptionOperation);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportRoles = new ArrayList<>();
        supportRoles.add(new AdoptionManagerRole());
        return supportRoles;
    }
    
}
