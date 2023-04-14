/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Organization.OrganizationDirectory;
import Model.UserAccount.UserAccountDirectory;
import Model.WorkQueue.WorkQueue;

/**
 *
 * @author alilovepeach
 */
public abstract class Enterprise {

    String name;
    Type type;
    WorkQueue workQueue;
    OrganizationDirectory organizationDirectory;
    UserAccountDirectory enterpriseUserAccounts;
    
    public enum Type {
        Volunteer("Volunteer"),
        MedicalCare("Medical Care"),
        OrphanShelter("Orphan Shelter"),
        Adoption("Adoption");

        private String value;

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

    public Enterprise(String name, Type type) {
        this.name = name;
        this.type = type;
        organizationDirectory = new OrganizationDirectory();
        this.workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}