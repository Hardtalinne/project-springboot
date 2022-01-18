package alfa.pos.projetowebdev;

import alfa.pos.projetowebdev.jpa.IRepositorioCliente;
import alfa.pos.projetowebdev.jpa.IRepositorioFuncionario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetoWebdevApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoWebdevApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
//            DAOCliente cliente = new DAOCliente(repoCliente);
//
//            DAOFuncionario funcionario = new DAOFuncionario(repoFuncionario);
//
//            Endereco end = new Endereco("Rua Domingos", "123", "casa", "87504-190",
//                    "Umuarama", "Paraná");
//
//            Endereco end2 = new Endereco("Rua Domingos", "123", "casa", "87504-190",
//                    "Umuarama", "Paraná");
//
//            List<Telefone> fone = new ArrayList<Telefone>();
//            fone.add(new Telefone("42", "999999999"));
//            fone.add(new Telefone("44", "888888888"));
//
//            List<Telefone> fone2 = new ArrayList<Telefone>();
//            fone2.add(new Telefone("44", "888888888"));
//
//            cliente.inserirCliente(new Cliente("Aline2","0000000"));
//            funcionario.inserirFuncionario(new Funcionario("Matheus", "12345678910", end2, fone2));
//
//            System.out.println(cliente.buscarClientes());
        };
    }
}
