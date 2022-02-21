package repositories;

import entities.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {
}
