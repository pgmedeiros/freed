package com.example.demo.post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    private String corpo;

    public Post(Integer postId) {
        this.id = postId;
    }

    public static Post of(PostRequest request) {
        var post = new Post();
        post.setTitulo(request.getTitulo());
        post.setCorpo(request.getCorpo());
        return post;
    }
}
