package tn.esprit.crm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.crm.models.Reclamation;

public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
}