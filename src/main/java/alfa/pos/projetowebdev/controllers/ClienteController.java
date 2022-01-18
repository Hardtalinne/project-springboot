package alfa.pos.projetowebdev.controllers;

import alfa.pos.projetowebdev.model.Cliente;
import alfa.pos.projetowebdev.services.ClienteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClienteController {

    private ClienteServiceInterface clienteService;

    @Autowired
    public void setProductService(ClienteServiceInterface clienteService) {
        this.clienteService = clienteService;
    }

    @RequestMapping({"/clientes"})
    public String listar(Model model) {
        model.addAttribute("clientes", clienteService.findAll());
        return "clientes";
    }

    @RequestMapping(value = "cliente/{id}", method = RequestMethod.GET)
    public String buscar(@PathVariable Integer id, Model model) {
        Cliente cliente = clienteService.getCliente(id);
        model.addAttribute("cliente", clienteService.getCliente(id));
        return "clienteshow";
    }

    @RequestMapping(value = "cliente/editar/{id}", method = RequestMethod.PUT)
    public String editar(@PathVariable Integer id, Model model) {
        model.addAttribute("cliente", clienteService.getCliente(id));
        return "clienteform";
    }

    @RequestMapping(value = "cliente/cadastrar", method = RequestMethod.POST)
    public String cadastrar(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clienteform";
    }

    @RequestMapping(value = "cliente", method = RequestMethod.POST)
    public String save(Cliente cliente) {
        clienteService.save(cliente);
        return "redirect:/cliente/" + cliente.getId();
    }

    @RequestMapping(value = "cliente/delete/{id}")
    public String delete(@PathVariable Integer id) {
        clienteService.delete(id);
        return "redirect:/cliente";
    }
}