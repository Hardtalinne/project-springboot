package alfa.pos.projetowebdev.jpa;

import alfa.pos.projetowebdev.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioVeiculo extends JpaRepository<Veiculo, Long> {
}
