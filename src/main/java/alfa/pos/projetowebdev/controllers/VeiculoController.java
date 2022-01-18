package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Veiculo;
import alfa.pos.projetowebdev.services.VeiculoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VeiculoController {

    private VeiculoServiceInterface veiculoService;

    @Autowired
    public void setVeiculoService(VeiculoServiceInterface veiculoService) {
        this.veiculoService = veiculoService;
    }

    @RequestMapping({"/veiculos"})
    public String listar(Model model) {
        model.addAttribute("veiculos", veiculoService.findAll());
        return "veiculos";
    }

    @RequestMapping(value = "veiculo/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Integer id, Model model) {
        Veiculo veiculo = veiculoService.getVeiculo(id);
        model.addAttribute("veiculo", veiculoService.getVeiculo(id));
        return "veiculo-visualizar";
    }

    @RequestMapping(value = "veiculo/editar/{id}", method = RequestMethod.PUT)
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("veiculo", veiculoService.getVeiculo(id));
        return "veiculo-formulario";
    }

    @RequestMapping(value = "veiculo/cadastrar", method = RequestMethod.POST)
    public String cadastrar(Model model) {
        model.addAttribute("veiculo", new Veiculo());
        return "veiculo-formulario";
    }

    @RequestMapping(value = "veiculo", method = RequestMethod.POST)
    public String save(Veiculo veiculo) {
        veiculoService.save(veiculo);
        return "redirect:/veiculo/" + veiculo.getId();
    }

    @RequestMapping(value = "veiculo/delete/{id}")
    public String delete(@PathVariable Integer id) {
        veiculoService.delete(id);
        return "redirect:/veiculo";
    }
}