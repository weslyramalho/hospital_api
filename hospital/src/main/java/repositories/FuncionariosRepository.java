package repositories;

import entities.FuncionariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionariosRepository extends JpaRepository<FuncionariosEntity, Long> {
}
