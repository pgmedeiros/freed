package com.example.demo.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/comentario")
public class ComentarioController {

    @Autowired
    private ComentarioService service;

    @PostMapping
    public void salvar(@RequestBody ComentarioRequest request) {
        service.salvar(request);
    }

    @GetMapping
    public List<Comentario> buscarTodos() {
        return service.buscarTodos();
    }

}
