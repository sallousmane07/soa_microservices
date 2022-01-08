package soa.project.medecin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import soa.project.medecin.model.Payement;

@Service
public class PayementService {
    
    @Autowired
    public RestTemplate restTemplate;


    // get payement à partir de la microservice 2 
    // pour renseigner plus tard le montant
    public Payement getPayement(int numPayement){
        Payement payement=restTemplate.getForObject("http://localhost:8081/payement/"+numPayement, Payement.class);
        return payement;
    }
}
