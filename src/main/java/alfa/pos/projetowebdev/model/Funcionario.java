package alfa.pos.projetowebdev.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String cpf;
    private String cargo;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefone;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf, Endereco endereco, List<Telefone> telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "[ Nome: " + this.nome +
                ", Endereco: " + this.endereco +
                ", Telefone: " + this.telefone +
                " ]";
    }
}
