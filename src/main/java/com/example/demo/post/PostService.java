package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public void salvar(PostRequest request) {
        repository.save(Post.of(request));
    }

    public List<Post> buscarTodos() {
        return repository.findAll();
    }

}
