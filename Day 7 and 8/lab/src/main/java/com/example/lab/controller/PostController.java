package com.example.lab.controller;

import com.example.lab.domain.Post;
import com.example.lab.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @GetMapping()
    public List<Post> getAll() {

        return postService.getAll();
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @GetMapping("/{id}")
    public Optional<Post> getById(@PathVariable long id) {
        return postService.getById(id);
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        postService.deletePost(id);
    }
}
