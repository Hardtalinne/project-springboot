package alfa.pos.projetowebdev.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import alfa.pos.projetowebdev.model.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioCliente extends JpaRepository<Cliente, Integer> {
}