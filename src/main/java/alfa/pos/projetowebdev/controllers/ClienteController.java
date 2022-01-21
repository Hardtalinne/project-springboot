package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Cliente;
import alfa.pos.projetowebdev.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    private ClienteServiceInterface clienteService;

    @Autowired
    public void setClienteService(ClienteServiceInterface clienteService) {
        this.clienteService = clienteService;
    }

    @RequestMapping({"/clientes"})
    public String listar(Model model) {
        model.addAttribute("cliente", clienteService.findAll());
        return "clientes";
    }

    @RequestMapping(value = "cliente/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Long id, Model model) {
        Cliente cliente = clienteService.getCliente(id);
        model.addAttribute("cliente", clienteService.getCliente(id));
        return "cliente-cadastrar";
    }

    @RequestMapping(value = "cliente/editar", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam long id, ModelMap model) {
        Cliente cliente = clienteService.getCliente(id);
        model.put("cliente", cliente);
        return "cliente-cadastrar";
    }

    @RequestMapping(value = "cliente/cadastrar", method = RequestMethod.GET)
    public String cadastrar(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cliente-cadastrar";
    }

    @RequestMapping(value = "cliente/cadastrar", method = RequestMethod.POST)
    public String save(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/cliente-cadastrar/" + cliente.getId();
    }

    @RequestMapping(value = "/cliente/deletar", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Long id) {
        clienteService.delete(id);
        return "redirect:/clientes";
    }

//    private String getLoggedInUserName(ModelMap model) {
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        if (principal instanceof UserDetails) {
//            return ((UserDetails) principal).getUsername();
//        }
//
//        return principal.toString();
//    }
}