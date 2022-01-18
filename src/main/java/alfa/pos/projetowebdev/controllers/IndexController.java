package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.jpa.IRepositorioCliente;
import alfa.pos.projetowebdev.jpa.IRepositorioVeiculo;
import alfa.pos.projetowebdev.jpa.dao.DAOCliente;
import alfa.pos.projetowebdev.jpa.dao.DAOVeiculo;
import alfa.pos.projetowebdev.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/efetuarLogin")
    @ResponseBody
    public String efetuarLogin(@RequestParam String login,
                               @RequestParam String senha) {

        if (!login.isEmpty() && !senha.isEmpty()) {
            return "Seja bem-vindo(a) " + login;
        }
        return "Preencha os campos login e senha!";
    }

    @RequestMapping("/clienteLogado")
    public String usuarioLogado() {
        return "clienteLogado";
    }

    @RequestMapping("/logout")
    public String clienteLogado(HttpSession session) {

        session.invalidate();
        return "login";
    }

    @RequestMapping("/veiculosAlugados")
    public String veiculosAlugados() {
        return "veiculosAlugados";
    }

}
