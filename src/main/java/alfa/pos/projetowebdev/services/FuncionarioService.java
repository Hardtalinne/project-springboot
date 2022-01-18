package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.jpa.IRepositorioFuncionario;
import alfa.pos.projetowebdev.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService implements FuncionarioServiceInterface {

    private IRepositorioFuncionario repositorioFuncionario;

    @Autowired
    public void setRepositorioFuncionario(IRepositorioFuncionario repositorioFuncionario) {
        this.repositorioFuncionario = repositorioFuncionario;
    }

    @Override
    public Iterable<Funcionario> findAll() {
        return repositorioFuncionario.findAll();
    }

    @Override
    public Funcionario getFuncionario(Integer id) {
        return repositorioFuncionario.getById(id);
    }

    @Override
    public Funcionario save(Funcionario product) {
        return repositorioFuncionario.save(product);
    }

    @Override
    public void delete(Integer id) {
        repositorioFuncionario.deleteById(id);
    }
}