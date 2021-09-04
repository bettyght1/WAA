package com.labThree.springBootStarter.controller;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.service.PostService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
@GetMapping
    public List<Post> getAll(){
        return postService.getAll();
    }
@GetMapping("/{id}")
    public Post getById(@PathVariable long id){
        return postService.getById(id);
    }
}
