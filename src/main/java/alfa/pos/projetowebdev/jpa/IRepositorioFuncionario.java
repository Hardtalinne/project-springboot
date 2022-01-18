package alfa.pos.projetowebdev.jpa;

import alfa.pos.projetowebdev.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioFuncionario extends JpaRepository<Funcionario, Integer> {
}
