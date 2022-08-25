package com.example.demo.comentario;

import com.example.demo.post.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue
    private Integer id;
    private String corpo;
    @ManyToOne
    private Post post;

    public static Comentario of(ComentarioRequest request) {
        var comentario = new Comentario();
        comentario.setCorpo(request.getCorpo());
        comentario.setPost(new Post(request.getPostId()));
        return comentario;
    }
}
