package com.labFive.springBootStarter.controller;

import com.labFive.springBootStarter.domain.Post;
import com.labFive.springBootStarter.service.PostService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping()
    public Iterable<Post> getAll() {

        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable long id) {
        return postService.getById(id);
    }


    @PostMapping("/addPost")
 public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
         postService.deletePost(id);
    }
}
