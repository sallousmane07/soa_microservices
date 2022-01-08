package soa.project.payement.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.project.payement.model.Payement;
import soa.project.payement.model.Ticket;
import soa.project.payement.repository.PayementRepository;
import soa.project.payement.service.TicketService;

@RestController
public class PayementController {

    @Autowired
    private PayementRepository payementRepository;

    @Autowired
    private TicketService ticketService;

    @PostMapping(value = "/payement/save/{numTicket}" )
    public Payement payer(@PathVariable("numTicket") int numTicket){
        //appel de la service pour recupérer le patient ( microservice 1)
        
        Ticket ticket= ticketService.getTicket(numTicket); // MICRO SERVICE 1
        Payement payement=new Payement();
        payement.setNumTicket(ticket.getNumticket());
        payement.setNom(ticket.getNom());//recuperer le nom du patient depuis microservice 1
        payement.setPrenom(ticket.getPrenom());//recuperer le nom du patient depuis microservice 1
        payement.setMontant(2000);// LE TICKET PAR DEFAUT 2000
        Date date=new Date();  

        payement.setDate(date);


        return payementRepository.save(payement); // enregistrement du patient
        
        
    }

    @GetMapping (value = "/payement/{numPayement}")
    public Payement getPayement(@PathVariable("numPayement") int numPayement){
        Optional<Payement> oPayement=payementRepository.findById(numPayement);
        if(!oPayement.isPresent()){
            throw new RuntimeException("Le numéro de payement n'existe pas");
        }

        return oPayement.get();


    }


}
