package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Funcionario;

import java.util.List;

public interface FuncionarioServiceInterface {

    List<Funcionario> findAll();

    Funcionario getFuncionario(Long id);

    Funcionario save(Funcionario funcionario);

    void delete(Long id);
}
