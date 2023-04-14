/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public abstract class Organization {

    Type type;
    String name;
    int organizationID;
    static int idCounter;

    public enum Type {
        OrphanRegister("Orphan Register Organization"), 
        OrphanManagement("Orphan Management Organization"), 
        Doctor("Doctor Organization"),
        Pharmacy("Pharmacy Organization"),
        Adopter("Adopter Organization"), 
        Authority("Authority Organization"), 
        VolunteerManagement("Volunteer Management Organization"), 
        Volunteer("Volunteer Organization");
        
        private final String value;
        
        private Type(String value) {
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

    public Organization(String name, Type type) {
        this.name = name;
        this.type = type;
        organizationID = idCounter;
        ++idCounter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public int getOrganizationID() {
        return organizationID;
    }

    public Type getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}