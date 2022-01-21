package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.jpa.IRepositorioAluguel;
import alfa.pos.projetowebdev.model.Aluguel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AluguelService implements AluguelServiceInterface {

    @Autowired
    private IRepositorioAluguel repositorioAluguel;

    @Autowired
    public void setRepositorioCliente(IRepositorioAluguel repositorioAluguel) {
        this.repositorioAluguel = repositorioAluguel;
    }

    @Override
    public List<Aluguel> findAll() {
        return repositorioAluguel.findAll();
    }

    @Override
    public Aluguel getAluguel(Long id) {
        return repositorioAluguel.getById(id);
    }

    @Override
    public Aluguel save(Aluguel cliente) {
        return repositorioAluguel.save(cliente);
    }

    @Override
    public void delete(Long id) {
        repositorioAluguel.deleteById(id);
    }

}