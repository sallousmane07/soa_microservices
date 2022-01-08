package soa.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import soa.project.demo.model.Patient;
import soa.project.demo.model.TestClient;
import soa.project.demo.repository.PatientRepository;
import soa.project.demo.service.PaiementService;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PaiementService paiementService;


    @PostMapping(value= "/patient/store")
    public Patient save(@RequestBody Patient patient){
       return  patientRepository.save(patient);
    }

    @GetMapping(value= "/tester")
    public TestClient tester(){
       return paiementService.bonjour();
    }
    
}
