package alfa.pos.projetowebdev.jpa.dao;

import alfa.pos.projetowebdev.jpa.IRepositorioFuncionario;
import alfa.pos.projetowebdev.model.Funcionario;

import java.util.List;

public class DAOFuncionario {
    private IRepositorioFuncionario repositorioFuncionario;

    public DAOFuncionario(IRepositorioFuncionario repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    public IRepositorioFuncionario getRepositorioFuncionario() {
        return repositorioFuncionario;
    }

    public void setRepositorioFuncionario(IRepositorioFuncionario repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    public void inserirFuncionario(Funcionario funcionario) {
        this.repositorioFuncionario.save(funcionario);
    }

    public List<Funcionario> buscarFuncionario() {
        return (List<Funcionario>) this.repositorioFuncionario.findAll();
    }
}
