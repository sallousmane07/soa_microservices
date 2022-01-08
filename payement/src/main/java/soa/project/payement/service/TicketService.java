package soa.project.payement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import soa.project.payement.model.Ticket;

@Service
public class TicketService {
    
    @Autowired
    private RestTemplate restTemplate;

    // sercice pour recupérere un patient à partir du MicroService 1
    public Ticket getTicket(int numTicket){
        Ticket ticket=restTemplate.getForObject("http://localhost:8080/patient/"+numTicket, Ticket.class);
        return ticket;

    }
}
