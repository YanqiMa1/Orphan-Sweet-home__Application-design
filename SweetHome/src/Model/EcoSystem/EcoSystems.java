package Model.EcoSystem;

import Model.Enterprise.EnterpriseDirectory;
import Model.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alilovepeach
 */
public class EcoSystems {
    ArrayList<Network> networkList;
    UserAccountDirectory userAccountDirectory;
    
    public EcoSystems(){
        this.networkList = new ArrayList<Network>();
        this.userAccountDirectory = new UserAccountDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

}
