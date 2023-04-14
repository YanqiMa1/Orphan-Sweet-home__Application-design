/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.UserAccount;

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

    public ArrayList<UserAccount> getUseraccountlist() {
        return userAccountList;
    }
     
    public UserAccount createUserAccount(String username, String password, Role role) {
        UserAccount user = new UserAccount(username, password, role);
        
        userAccountList.add(user);
        return user;
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.userAccountList) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, Role role) {
        for(UserAccount u: this.userAccountList) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username) {
        for(UserAccount u: this.userAccountList) {
            if(u.getUsername().equals(username)) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccountList) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
      public UserAccount findByUsername(String username) {
        for(UserAccount ua: this.userAccountList) {
            if(ua.getUsername().equals(username)) {
                return ua;
            }
        }
        
        return null;
    }
}
