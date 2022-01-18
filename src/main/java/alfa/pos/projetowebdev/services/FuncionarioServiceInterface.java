package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Funcionario;

public interface FuncionarioServiceInterface {

    Iterable<Funcionario> findAll();

    Funcionario getFuncionario(Integer id);

    Funcionario save(Funcionario funcionario);

    void delete(Integer id);
}
