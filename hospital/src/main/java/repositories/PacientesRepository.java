package repositories;

import entities.PacientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PacientesRepository extends JpaRepository<PacientesEntity, Long> {
    List<PacientesEntity> findByName(String nome);
}
