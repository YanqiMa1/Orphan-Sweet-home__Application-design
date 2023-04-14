/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;


import Model.EcoSystem.Network;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;

import java.util.ArrayList;

/**
 *
 * @author alilovepeach
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }


    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {

                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Role role, Network network, Enterprise enterprise, Organization organization) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);  
        userAccount.setNetwork(network);
        userAccount.setEnterprise(enterprise);
        userAccount.setOrgainization(organization);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean userNameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (username.equalsIgnoreCase(ua.getUsername())) {
                return false;
            }
        }
        return true;
    }
}
