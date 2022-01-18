package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Cliente;

public interface ClienteServiceInterface {

    Iterable<Cliente> findAll();

    Cliente getCliente(Integer id);

    Cliente save(Cliente cliente);

    void delete(Integer id);
}
