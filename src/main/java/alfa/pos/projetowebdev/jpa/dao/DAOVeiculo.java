package alfa.pos.projetowebdev.jpa.dao;

import alfa.pos.projetowebdev.jpa.IRepositorioVeiculo;
import alfa.pos.projetowebdev.model.Veiculo;

import java.util.List;

public class DAOVeiculo {
    private IRepositorioVeiculo repositorioVeiculo;

    public DAOVeiculo(IRepositorioVeiculo repositorioVeiculo) {
        this.repositorioVeiculo = repositorioVeiculo;
    }

    public IRepositorioVeiculo getRepositorioVeiculo() {
        return repositorioVeiculo;
    }

    public void setRepositorioVeiculo(IRepositorioVeiculo repositorioVeiculo) {
        this.repositorioVeiculo = repositorioVeiculo;
    }

    public void inserirVeiculo(Veiculo veiculo) {
        this.repositorioVeiculo.save(veiculo);
    }

    public List<Veiculo> buscarVeiculo() {
        return (List<Veiculo>) this.repositorioVeiculo.findAll();
    }

//    public List<Veiculo> listarVeiculosPorDisponibilidade() {
//        return (List<Veiculo>) this.repositorioVeiculo.findVeiculoByDisponibilidadeIsTrue();
//    }
}
