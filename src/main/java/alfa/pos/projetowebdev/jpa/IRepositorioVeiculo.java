package alfa.pos.projetowebdev.jpa;

import alfa.pos.projetowebdev.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioVeiculo extends JpaRepository<Veiculo, Integer> {
}
