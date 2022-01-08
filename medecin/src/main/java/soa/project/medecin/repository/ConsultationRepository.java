package soa.project.medecin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.project.medecin.model.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation,Integer>{
    
    
}
