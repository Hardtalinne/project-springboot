package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.model.Aluguel;

import java.util.List;

public interface AluguelServiceInterface {

    List<Aluguel> findAll();

    Aluguel getAluguel(Long id);

    Aluguel save(Aluguel aluguel);

    void delete(Long id);
}
