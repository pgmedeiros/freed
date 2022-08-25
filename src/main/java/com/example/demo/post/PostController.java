package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/post")
public class PostController {

    @Autowired
    private PostService service;

    @PostMapping
    public void salvar(@RequestBody PostRequest postRequest) {
        service.salvar(postRequest);
    }

    @GetMapping
    public List<Post> buscarTodos() {
        return service.buscarTodos();
    }

}
