package com.example.labSix.controller;

import com.example.labSix.domain1.Post;
import com.example.labSix.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping()
    public List<Post> getAll() {

        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable long id) {
        return postService.getById(id);
    }


    @PostMapping()
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        postService.deletePost(id);
    }
}

