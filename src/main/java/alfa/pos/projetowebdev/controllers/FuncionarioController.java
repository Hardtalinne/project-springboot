package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Cliente;
import alfa.pos.projetowebdev.model.Funcionario;
import alfa.pos.projetowebdev.services.FuncionarioServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

    private FuncionarioServiceInterface funcionarioService;

    @Autowired
    public void setFuncionarioService(FuncionarioServiceInterface funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @RequestMapping({"/funcionarios"})
    public String listar(Model model) {
        model.addAttribute("funcionario", funcionarioService.findAll());
        return "funcionarios";
    }

    @RequestMapping(value = "funcionario/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Long id, Model model) {
        Funcionario funcionario = funcionarioService.getFuncionario(id);
        model.addAttribute("funcionario", funcionarioService.getFuncionario(id));
        return "funcionario-cadastrar";
    }

    @RequestMapping(value = "funcionario/editar", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
        Funcionario funcionario = funcionarioService.getFuncionario(id);
        model.put("funcionario", funcionario);
        return "funcionario-cadastrar";
    }

    @RequestMapping(value = "funcionario/cadastrar", method = RequestMethod.GET)
    public String cadastrar(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "funcionario-cadastrar";
    }

    @RequestMapping(value = "funcionario/cadastrar", method = RequestMethod.POST)
    public String save(Funcionario funcionario) {
        funcionarioService.save(funcionario);
        return "redirect:/funcionario-cadastrar/" + funcionario.getId();
    }

    @RequestMapping(value = "/funcionario/deletar", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Long id) {
        funcionarioService.delete(id);
        return "redirect:/funcionarios";
    }
}