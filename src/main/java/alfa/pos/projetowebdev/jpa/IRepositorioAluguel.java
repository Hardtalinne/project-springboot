package alfa.pos.projetowebdev.jpa;

import alfa.pos.projetowebdev.model.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioAluguel extends JpaRepository<Aluguel, Long> {
}