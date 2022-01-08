package soa.project.payement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import soa.project.payement.model.Payement;

public interface PayementRepository extends JpaRepository<Payement, Integer>{
    
}
