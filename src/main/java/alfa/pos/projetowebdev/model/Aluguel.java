package alfa.pos.projetowebdev.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Aluguel {

    @Id
    @GeneratedValue
    private Long id;
    private Date dataAluguel;
    private String valorAluguel;

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    private Date dataDevolucao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(String valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
