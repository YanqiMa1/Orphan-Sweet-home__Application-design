/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

/**
 *
 * @author hp
 */
public class MedCareRequest extends WorkRequest {

    private String doctorResult;

    public String getVetResult() {
        return doctorResult;
    }

    public void setVetResult(String vetResult) {
        this.doctorResult = doctorResult;
    }

}