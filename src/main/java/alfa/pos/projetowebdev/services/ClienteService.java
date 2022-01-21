package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.jpa.IRepositorioCliente;
import alfa.pos.projetowebdev.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private IRepositorioCliente repositorioCliente;

    @Autowired
    public void setRepositorioCliente(IRepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    @Override
    public List<Cliente> findAll() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente getCliente(Long id) {
        return repositorioCliente.getById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public void delete(Long id) {
        repositorioCliente.deleteById(id);
    }

}