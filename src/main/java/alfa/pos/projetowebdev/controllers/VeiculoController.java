package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Funcionario;
import alfa.pos.projetowebdev.model.Veiculo;
import alfa.pos.projetowebdev.services.VeiculoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VeiculoController {

    private VeiculoServiceInterface veiculoService;

    @Autowired
    public void setVeiculoService(VeiculoServiceInterface veiculoService) {
        this.veiculoService = veiculoService;
    }

    @RequestMapping({"/veiculos"})
    public String listar(Model model) {
        model.addAttribute("veiculo", veiculoService.findAll());
        return "veiculos";
    }

    @RequestMapping(value = "veiculo/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Long id, Model model) {
        Veiculo veiculo = veiculoService.getVeiculo(id);
        model.addAttribute("veiculo", veiculoService.getVeiculo(id));
        return "veiculo-cadastrar";
    }

    @RequestMapping(value = "veiculo/editar", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
        Veiculo veiculo = veiculoService.getVeiculo(id);
        model.put("veiculo", veiculo);
        return "veiculo-cadastrar";
    }

    @RequestMapping(value = "veiculo/cadastrar", method = RequestMethod.GET)
    public String cadastrar(Model model) {
        model.addAttribute("veiculo", new Veiculo());
        return "veiculo-cadastrar";
    }

    @RequestMapping(value = "veiculo/cadastrar", method = RequestMethod.POST)
    public String save(Veiculo veiculo) {
        veiculoService.save(veiculo);
        return "redirect:/veiculo-cadastrar/" + veiculo.getId();
    }

    @RequestMapping(value = "/veiculo/deletar", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Long id) {
        veiculoService.delete(id);
        return "redirect:/veiculos";
    }

}