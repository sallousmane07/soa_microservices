package soa.project.consultation.santeaccueil.controller;

import java.util.Optional;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import soa.project.consultation.santeaccueil.model.Ticket;
import soa.project.consultation.santeaccueil.repository.TicketRepository;

@RestController
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    
    @PostMapping(value ="/patient/store")
    public Ticket save (@RequestBody Ticket ticket){
        ticket.setDate(new Date());
        return ticketRepository.save(ticket);

    }

    @GetMapping(value="/patient/{ticket}")
    // @ResponseBody
    // recuperation d'un patient
    public Ticket getTicket(@PathVariable("ticket") int ticket){
            Optional<Ticket> oTicket=ticketRepository.findById(ticket);
            if(!oTicket.isPresent()){
                throw new RuntimeException("Le numéro de ticket n'existe pas");
            }
            return oTicket.get();
    }

    // renvoie la liste des patients
    @GetMapping(value="/patients")
    public List<Ticket> getPatients(){
        return ticketRepository.findAll();
    }


}
