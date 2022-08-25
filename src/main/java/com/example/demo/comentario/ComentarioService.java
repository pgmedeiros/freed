package com.example.demo.comentario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository repository;

    public void salvar(ComentarioRequest request) {
        repository.save(Comentario.of(request));
    }

    public List<Comentario> buscarTodos() {
        return repository.findAll();
    }
}
