package Model.EcoSystem;

import Model.Enterprise.EnterpriseDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alilovepeach
 */
public class EcoSystems {
    EnterpriseDirectory enterpriseDirectory;
    UserAccountDirectory userAccountDirectory;
    
    public EcoSystems(){
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

}
