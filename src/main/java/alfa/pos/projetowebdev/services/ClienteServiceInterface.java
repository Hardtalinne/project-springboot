package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Cliente;

import java.util.List;

public interface ClienteServiceInterface {

    List<Cliente> findAll();

    Cliente getCliente(Long id);

    Cliente save(Cliente cliente);

    void delete(Long id);
}
