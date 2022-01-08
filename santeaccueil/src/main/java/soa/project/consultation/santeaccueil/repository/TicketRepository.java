package soa.project.consultation.santeaccueil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.project.consultation.santeaccueil.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    
}
