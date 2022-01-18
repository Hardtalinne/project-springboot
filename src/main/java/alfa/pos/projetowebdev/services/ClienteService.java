package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.jpa.IRepositorioCliente;
import alfa.pos.projetowebdev.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements ClienteServiceInterface {

    private IRepositorioCliente repositorioCliente;

    @Autowired
    public void setRepositorioCliente(IRepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    @Override
    public Iterable<Cliente> findAll() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente getCliente(Integer id) {
        return repositorioCliente.getById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        repositorioCliente.deleteById(id);
    }
}