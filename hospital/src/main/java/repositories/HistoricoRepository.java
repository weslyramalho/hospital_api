package repositories;

import entities.HistoricoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoRepository extends JpaRepository<HistoricoEntity, Long> {
}
