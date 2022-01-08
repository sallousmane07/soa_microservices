package soa.project.medecin.model;

import java.util.ArrayList;
import java.util.List;

public class PatientList {
   
    private List<Ticket> patients;
    public PatientList(){
        patients=new ArrayList<>();
    }

    public List<Ticket> getPatients() {
        return patients;
    }

    public void setPatients(List<Ticket> patients) {
        this.patients = patients;
    }
   


}
