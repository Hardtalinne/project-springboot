package alfa.pos.projetowebdev.services;

import alfa.pos.projetowebdev.jpa.IRepositorioVeiculo;
import alfa.pos.projetowebdev.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService implements VeiculoServiceInterface {

    private IRepositorioVeiculo repositorioVeiculo;

    @Autowired
    public void setRepositorioVeiculo(IRepositorioVeiculo repositorioVeiculo) {
        this.repositorioVeiculo = repositorioVeiculo;
    }

    @Override
    public List <Veiculo> findAll() {
        return repositorioVeiculo.findAll();
    }

    @Override
    public Veiculo getVeiculo(Long id) {
        return repositorioVeiculo.getById(id);
    }

    @Override
    public Veiculo save(Veiculo veiculo) {
        return repositorioVeiculo.save(veiculo);
    }

    @Override
    public void delete(Long id) {
        repositorioVeiculo.deleteById(id);
    }
}