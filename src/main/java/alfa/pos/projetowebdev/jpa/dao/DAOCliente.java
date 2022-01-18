package alfa.pos.projetowebdev.jpa.dao;

import alfa.pos.projetowebdev.jpa.IRepositorioCliente;
import alfa.pos.projetowebdev.model.Cliente;

import java.util.List;

public class DAOCliente {
    private IRepositorioCliente repositorioClientes;

    public DAOCliente(IRepositorioCliente repositorioUsuario) {
        this.repositorioClientes = repositorioUsuario;
    }

    public IRepositorioCliente getRepositorioUsuario() {
        return repositorioClientes;
    }

    public void setRepositorioUsuario(IRepositorioCliente repositorioUsuario) {
            this.repositorioClientes = repositorioUsuario;
    }

    public void inserirCliente(Cliente cliente) {
        this.repositorioClientes.save(cliente);
    }

    public List<Cliente> buscarClientes() {
        return (List<Cliente>) this.repositorioClientes.findAll();
    }
}
