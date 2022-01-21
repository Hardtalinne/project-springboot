package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Aluguel;
import alfa.pos.projetowebdev.services.AluguelServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AluguelController {

    private AluguelServiceInterface aluguelService;

    @Autowired
    public void setAluguelService(AluguelServiceInterface aluguelService) {
        this.aluguelService = aluguelService;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-mm-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @RequestMapping({"/alugueis"})
    public String listar(Model model) {
        model.addAttribute("aluguel", aluguelService.findAll());
        return "alugueis";
    }

    @RequestMapping(value = "aluguel/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Long id, Model model) {
        Aluguel aluguel = aluguelService.getAluguel(id);
        model.addAttribute("aluguel", aluguelService.getAluguel(id));
        return "aluguel-cadastrar";
    }

    @RequestMapping(value = "aluguel/editar", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
        Aluguel aluguel = aluguelService.getAluguel(id);
        model.put("aluguel", aluguel);
        return "aluguel-cadastrar";
    }

    @RequestMapping(value = "aluguel/cadastrar", method = RequestMethod.GET)
    public String cadastrar(Model model) {
        model.addAttribute("aluguel", new Aluguel());
        return "aluguel-cadastrar";
    }

    @RequestMapping(value = "aluguel/cadastrar", method = RequestMethod.POST)
    public String save(Aluguel aluguel) {

        aluguelService.save(aluguel);
        return "redirect:/aluguel-cadastrar/" + aluguel.getId();
    }

    @RequestMapping(value = "/aluguel/deletar", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Long id) {
        aluguelService.delete(id);
        return "redirect:/alugueis";
    }

    @RequestMapping({"/relatorioAlugueis"})
    public String listarRelatorio(Model model) {
        model.addAttribute("aluguel", aluguelService.findAll());
        return "relatorioAlugueis";
    }
}