package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Veiculo;

import java.util.List;

public interface VeiculoServiceInterface {

    List <Veiculo> findAll();

    Veiculo getVeiculo(Long id);

    Veiculo save(Veiculo veiculo);

    void delete(Long id);
}
