package soa.project.medecin.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import soa.project.medecin.model.Ticket;

@Service
public class PatientService {
    @Autowired
    private RestTemplate restTemplate;

    // microservice 1
    // connection pour enregistrer la liste des patients
    public List<Ticket> getPatients(){
    
        List<Ticket> patientList= new ArrayList<Ticket>();
        patientList=restTemplate.getForObject("http://localhost:8080/patients/", List.class);

        return patientList;

    }
    // recuperation d'un patient à partir de la microservice 1
    
    public Ticket getPatient(int numPatient){

        Ticket patient=restTemplate.getForObject("http://localhost:8080/patient/"+numPatient, Ticket.class);

        return patient;
    }

    // recuperation d 'un patient à  travers la liste des patients// à faire'
}
