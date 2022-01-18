package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Veiculo;

public interface VeiculoServiceInterface {

    Iterable<Veiculo> findAll();

    Veiculo getVeiculo(Integer id);

    Veiculo save(Veiculo veiculo);

    void delete(Integer id);
}
