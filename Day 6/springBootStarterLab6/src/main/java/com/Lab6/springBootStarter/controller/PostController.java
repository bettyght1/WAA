package com.labSix.springBootStarter.controller;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Post> getAll() {

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

//    @PutMapping("/{id}")
//    public void updateById(@RequestBody Post post, @PathVariable long id) {
//
//        postService.updateById(post, id);
//    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
         postService.deletePost(id);
    }
}
