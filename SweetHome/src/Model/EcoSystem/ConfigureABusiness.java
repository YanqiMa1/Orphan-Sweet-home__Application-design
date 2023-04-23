/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.EcoSystem;

import Model.Enterprise.Enterprise;
import Model.Enterprise.OrphanShelterEnterprise;
import Model.Organization.Organization;
import Model.Orphan.Orphan;
import Model.Role.AdopterRole;
import Model.Role.AuthorityRole;
import Model.Role.DoctorRole;
import Model.Role.OrphanManagementRole;
import Model.Role.OrphanRegisterRole;
import Model.Role.PharmacistRole;
import Model.Role.Role;
import Model.Role.SystemAdminRole;
import Model.Role.VolunteerManagerRole;
import Model.Role.VolunteerRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.AdopterAuthorizationRequest;
import Model.WorkQueue.OrphanManagerRequest;

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
        Enterprise boston11 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1OrShelter", Enterprise.Type.OrphanShelter);
        Enterprise boston2 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_MedicalCareCenter", Enterprise.Type.MedicalCare);
        Enterprise boston21 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1MedicalCareCenter", Enterprise.Type.MedicalCare);
        Enterprise boston3 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_VolunteerCenter", Enterprise.Type.Volunteer);
        Enterprise boston31 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1VolunteerCenter", Enterprise.Type.Volunteer);
        Enterprise boston4 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_Adoption", Enterprise.Type.Adoption);
        Enterprise boston41 = newNetwork2.getEnterpriseDirectory().createAndAddEnterprise("Bos_1Adoption", Enterprise.Type.Adoption);

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
        //boston
        Organization b1 = boston1.getOrganizationDirectory().createOrganization("Bos_orphanManagement", Organization.Type.OrphanManagement);
        Organization b11 = boston1.getOrganizationDirectory().createOrganization("Bos_1orphanManagement", Organization.Type.OrphanManagement);
        Organization b2 = boston2.getOrganizationDirectory().createOrganization("Bos_doctor", Organization.Type.Doctor);
         Organization b21 = boston2.getOrganizationDirectory().createOrganization("Bos_1doctor", Organization.Type.Doctor);
        Organization b3 = boston2.getOrganizationDirectory().createOrganization("Bos_pharmacy", Organization.Type.Pharmacy);
Organization b31 = boston2.getOrganizationDirectory().createOrganization("Bos_1pharmacy", Organization.Type.Pharmacy);

        Organization b4 = boston3.getOrganizationDirectory().createOrganization("Bos_volunteerManagement", Organization.Type.VolunteerManagement);
         Organization b41 = boston3.getOrganizationDirectory().createOrganization("Bos_1volunteerManagement", Organization.Type.VolunteerManagement);

        Organization b5 = boston4.getOrganizationDirectory().createOrganization("Bos_Adoption", Organization.Type.AdopterManagement);
        Organization b6 = boston4.getOrganizationDirectory().createOrganization("Bos_athority", Organization.Type.Authority);
        Organization b51 = boston4.getOrganizationDirectory().createOrganization("Bos_1Adoption", Organization.Type.AdopterManagement);
        Organization b61 = boston4.getOrganizationDirectory().createOrganization("Bos_1athority", Organization.Type.Authority);

        //Malden
        Organization m1 = mal1.getOrganizationDirectory().createOrganization("Mal_orphanManagement", Organization.Type.OrphanManagement);

        Organization m2 = mal2.getOrganizationDirectory().createOrganization("Mal_doctor", Organization.Type.Doctor);
        Organization m3 = mal2.getOrganizationDirectory().createOrganization("Mal_pharmacy", Organization.Type.Pharmacy);

        Organization m4 = mal3.getOrganizationDirectory().createOrganization("Mal_volunteerManagement", Organization.Type.VolunteerManagement);

        Organization m5 = mal4.getOrganizationDirectory().createOrganization("Mal_Adoption", Organization.Type.AdopterManagement);
        Organization m6 = mal4.getOrganizationDirectory().createOrganization("Mal_athority", Organization.Type.Authority);

        //cambridge
        Organization c1 = cam1.getOrganizationDirectory().createOrganization("Cam_orphanManagement", Organization.Type.OrphanManagement);

        Organization c2 = cam2.getOrganizationDirectory().createOrganization("Cam_doctor", Organization.Type.Doctor);
        Organization c3 = cam2.getOrganizationDirectory().createOrganization("Cam_pharmacy", Organization.Type.Pharmacy);

        Organization c4 = cam3.getOrganizationDirectory().createOrganization("Cam_volunteerManagement", Organization.Type.VolunteerManagement);

        Organization c5 = cam4.getOrganizationDirectory().createOrganization("Cam_Adoption", Organization.Type.AdopterManagement);
        Organization c6 = cam4.getOrganizationDirectory().createOrganization("Cam_athority", Organization.Type.Authority);

        //create default user role(except adopters)
        //for boston
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount ub1 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OM", "Bos_OM", new OrphanManagementRole(), newNetwork2, boston1, b1);
        UserAccount ub11 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OM1", "Bos_OM1", new OrphanManagementRole(), newNetwork2, boston1, b1);
        UserAccount ub2 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OR", "Bos_OR", new OrphanRegisterRole(), newNetwork2, boston1, b1);
        UserAccount ub21 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_OR1", "Bos_OR1", new OrphanRegisterRole(), newNetwork2, boston1, b1);
        //AdopterManagementOrganization(Adopter)
        UserAccount ub3 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AD", "Bos_AD", new AdopterRole(), newNetwork2, boston4, b5);
        ub3.setEmailId("ub3@sweethome.com");
        ub3.setIncome(Float.valueOf(65000));

        AdopterAuthorizationRequest request = new AdopterAuthorizationRequest();
        request.setMessage("New User");
        request.setSender(ub3);
        request.setStatus("Pending");

        boston4.getWorkQueue().getWorkRequestList().add(request);
        ub3.getWorkQueue().getWorkRequestList().add(request);
        //AuthorityOrg(Authrity)
        UserAccount ub4 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AU", "Bos_AU", new AuthorityRole(), newNetwork2, boston4, b6);
        UserAccount ub41 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_AU1", "Bos_AU1", new AuthorityRole(), newNetwork2, boston4, b6);
        //DoctorOrg(Doector)
        UserAccount ub5 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_DOC", "Bos_DOC", new DoctorRole(), newNetwork2, boston2, b2);
         UserAccount ub51 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_DOC", "Bos_DOC1", new DoctorRole(), newNetwork2, boston2, b2);
        //PharmacyOrg(Pharmacy)
        UserAccount ub6 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_Phar", "Bos_Phar", new PharmacistRole(), newNetwork2, boston2, b3);
        UserAccount ub61 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_Phar1", "Bos_Phar1", new PharmacistRole(), newNetwork2, boston2, b3);
        //volunteerOrg(volunteerManagemer&volunteer)

        UserAccount ub701 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V1", "Bos_V1", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub702 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V2", "Bos_V2", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub703 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V3", "Bos_V3", new VolunteerRole(), newNetwork2, boston3, b4);
        UserAccount ub704 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_V4", "Bos_V4", new VolunteerRole(), newNetwork2, boston3, b4);
        
        UserAccount ub8 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_VM", "Bos_VM", new VolunteerManagerRole(), newNetwork2, boston3, b4);
         UserAccount ub81 = ecoSystem.getUserAccountDirectory().createUserAccount("Bos_VM1", "Bos_VM1", new VolunteerManagerRole(), newNetwork2, boston3, b4);

        //for malden
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount um1 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_OM", "Mal_OM", new OrphanManagementRole(), newNetwork3, mal1, m1);
        UserAccount um2 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_OR", "Mal_OR", new OrphanRegisterRole(), newNetwork3, mal1, m1);
        //AdopterManagementOrganization(Adopter)
        UserAccount um3 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_AD", "Mal_AD", new AdopterRole(), newNetwork3, mal4, m5);
        um3.setEmailId("um3@sweethome.com");
        um3.setIncome(Float.valueOf(125000));

        AdopterAuthorizationRequest request2 = new AdopterAuthorizationRequest();
        request2.setMessage("New User");
        request2.setSender(um3);
        request2.setStatus("Pending");

        mal4.getWorkQueue().getWorkRequestList().add(request2);
        um3.getWorkQueue().getWorkRequestList().add(request2);
//AuthorityOrg(Authrity)
        UserAccount um4 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_AU", "Mal_AU", new AuthorityRole(), newNetwork3, mal4, m6);

        //DoctorOrg(Doector)
        UserAccount um5 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_DOC", "Mal_DOC", new DoctorRole(), newNetwork3, mal2, m2);
        //PharmacyOrg(Pharmacy)
        UserAccount um6 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_Phar", "Mal_Phar", new PharmacistRole(), newNetwork3, mal2, m3);
        //volunteerOrg(volunteerManagemer&volunteer)
        UserAccount um7 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_V", "Mal_V", new VolunteerRole(), newNetwork3, mal3, m4);
        UserAccount um8 = ecoSystem.getUserAccountDirectory().createUserAccount("Mal_VM", "Mal_VM", new VolunteerManagerRole(), newNetwork3, mal3, m4);

        //for cambridge
        //orphanManagementOrganization(orphanManagement & orphanRegister)
        UserAccount uc1 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_OM", "Cam_OM", new OrphanManagementRole(), newNetwork4, cam1, c1);
        UserAccount uc2 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_OR", "Cam_OR", new OrphanRegisterRole(), newNetwork4, cam1, c1);
        //AdopterManagementOrganization(Adopter)
        UserAccount uc3 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_AD", "Cam_AD", new AdopterRole(), newNetwork4, cam4, c5);
        uc3.setEmailId("uc3@sweethome.com");
        uc3.setIncome(Float.valueOf(37000));

        AdopterAuthorizationRequest request3 = new AdopterAuthorizationRequest();
        request3.setMessage("New User");
        request3.setSender(uc3);
        request3.setStatus("Pending");

        cam4.getWorkQueue().getWorkRequestList().add(request3);
        uc3.getWorkQueue().getWorkRequestList().add(request3);

//AuthorityOrg(Authrity)
        UserAccount uc4 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_AU", "Cam_AU", new AuthorityRole(), newNetwork4, cam4, c6);
        //DoctorOrg(Doector)
        UserAccount uc5 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_DOC", "Cam_DOC", new DoctorRole(), newNetwork4, cam2, c2);
        //PharmacyOrg(Pharmacy)
        UserAccount uc6 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_Phar", "Cam_Phar", new PharmacistRole(), newNetwork4, cam2, c3);
        //volunteerOrg(volunteerManagemer&volunteer)
        UserAccount uc7 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_V", "Cam_V", new VolunteerRole(), newNetwork4, cam3, c4);
        UserAccount uc8 = ecoSystem.getUserAccountDirectory().createUserAccount("Cam_VM", "Cam_VM", new VolunteerManagerRole(), newNetwork4, cam3, c4);

        //create orphan1 for boston network 
        Orphan orphan1 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("Lili");
        orphan1.setAge(2);
        orphan1.setSex("female");
        orphan1.setRace("Black or African American");
        orphan1.setPhoto("a");

        OrphanManagerRequest requestOr1 = new OrphanManagerRequest();
        requestOr1.setMessage("New Orphan");
        requestOr1.setSender(ub2);
        requestOr1.setStatus("Waiting for Manager");
        requestOr1.setOrphan(orphan1);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr1);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr1);

        //create orphan2 for boston network 
        Orphan orphan2 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("David");
        orphan2.setAge(4);
        orphan2.setSex("male");
        orphan2.setRace("White");
        orphan2.setPhoto("a");

        OrphanManagerRequest requestOr2 = new OrphanManagerRequest();
        requestOr2.setMessage("New Orphan");
        requestOr2.setSender(ub2);
        requestOr2.setStatus("Waiting for Manager");
        requestOr2.setOrphan(orphan2);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr2);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr2);

        //create orphan2 for boston network 
        Orphan orphan3 = ((OrphanShelterEnterprise) boston1).getOrphanDirectory().createOrphan("Emma");
        orphan3.setAge(3);
        orphan3.setSex("female");
        orphan3.setRace("White");
        orphan3.setPhoto("a");

        OrphanManagerRequest requestOr3 = new OrphanManagerRequest();
        requestOr3.setMessage("New Orphan");
        requestOr3.setSender(ub2);
        requestOr3.setStatus("Waiting for Manager");
        requestOr3.setOrphan(orphan3);
        ub2.getWorkQueue().getWorkRequestList().add(requestOr3);
        boston1.getWorkQueue().getWorkRequestList().add(requestOr3);

        return ecoSystem;
    }

}
