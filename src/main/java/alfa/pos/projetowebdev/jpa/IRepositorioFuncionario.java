package alfa.pos.projetowebdev.jpa;

import alfa.pos.projetowebdev.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioFuncionario extends JpaRepository<Funcionario, Long> {
}
