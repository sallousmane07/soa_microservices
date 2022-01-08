package soa.project.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import soa.project.demo.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

    
    
}
