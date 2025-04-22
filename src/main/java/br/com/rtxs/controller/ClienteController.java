package br.com.rtxs.controller;

import br.com.rtxs.dto.Cliente;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/cliente")
@RestController
public class ClienteController {


    @GetMapping
    @ResponseBody
    public Cliente getNome() {

        Cliente cliente = new Cliente();
        cliente.setNome("Jonas");

        return cliente;
    }

    @RequestMapping("/dado")
    @ResponseBody
    public void setCliente(@RequestBody Cliente cliente) {
        System.out.println(cliente.getNome());
    }

}
