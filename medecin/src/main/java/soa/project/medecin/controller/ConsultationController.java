package soa.project.medecin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import soa.project.medecin.model.Consultation;
import soa.project.medecin.model.Payement;
import soa.project.medecin.model.Ticket;
import soa.project.medecin.repository.ConsultationRepository;
import soa.project.medecin.service.PatientService;
import soa.project.medecin.service.PayementService;

@RestController
public class ConsultationController {
    @Autowired
    private ConsultationRepository consultationRepository;
    @Autowired
    private PayementService payementService;
    @Autowired
    private PatientService patientService;

    //recuperation de la liste des Patients à partir de 1
    @GetMapping(value = "/consultation/patients")
    public List<Ticket> getPatients(){
        return patientService.getPatients();
   
    }

    @GetMapping(value = "/consulter/{numPayement}")
    public Consultation consulter(@PathVariable("numPayement") int numPayement){
        // appel microservice 2 pour le montant
        Payement payement = payementService.getPayement(numPayement);
        // appel microservice 1 pour le patient
        Ticket patient = patientService.getPatient(payement.getNumTicket());

        Consultation consultation=new Consultation();
        
        // recuperation du montant à partir du micro 2
        consultation.setMontant(payement.getMontant());
        consultation.setNumTicket(payement.getNumTicket());
        
        // recuperation des données partir du micro 1
        consultation.setNom(patient.getNom());
        consultation.setPrenom(patient.getPrenom());
        consultation.setDate(new Date());
        consultation.setAge(patient.getAge());

        return consultationRepository.save(consultation);
    }

}
