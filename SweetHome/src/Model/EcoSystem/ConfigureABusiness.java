/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EcoSystem;

import Model.Enterprise.Enterprise;
import Model.Role.SystemAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author alilovepeach
 */
public class ConfigureABusiness {

    public ConfigureABusiness() {

    }

    public static EcoSystem configure() {

        EcoSystem ecoSystem = new EcoSystem();
        //create a default sysdem admin 
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());

        ecoSystem.setSystemAdmin(account);

        //create some default network
        Network newNetwork2 = ecoSystem.createNetwork("Boston");
        Network newNetwork3 = ecoSystem.createNetwork("Malden");
        Network newNetwork4 = ecoSystem.createNetwork("Cambridge");

        //create some default enterprise
        //boston
        Enterprise boston1 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_OrphanShelter", Enterprise.Type.OrphanShelter);
        Enterprise boston2 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_MedicalCareCenter", Enterprise.Type.MedicalCare);
        Enterprise boston3 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_VolunteerCenter", Enterprise.Type.Volunteer);
        Enterprise boston4 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_Adoption", Enterprise.Type.Adoption);

        //Malden
        Enterprise mal1 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_OrphanShelter", Enterprise.Type.OrphanShelter);
        Enterprise mal2 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_MedicalCareCenter", Enterprise.Type.MedicalCare);
        Enterprise mal3 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_VolunteerCenter", Enterprise.Type.Volunteer);
        Enterprise mal4 = newNetwork3.getEnterpriseDirectory().createAndAddEnterprise("Mal_Adoption", Enterprise.Type.Adoption);

        //Cambridge
        Enterprise cam1 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_OrphanShelter", Enterprise.Type.OrphanShelter);
        Enterprise cam2 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_MedicalCareCenter", Enterprise.Type.MedicalCare);
        Enterprise cam3 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_VolunteerCenter", Enterprise.Type.Volunteer);
        Enterprise cam4 = newNetwork4.getEnterpriseDirectory().createAndAddEnterprise("Cam_Adoption", Enterprise.Type.Adoption);
       
        //create some default organization
        
        
        return ecoSystem;
    }

}
