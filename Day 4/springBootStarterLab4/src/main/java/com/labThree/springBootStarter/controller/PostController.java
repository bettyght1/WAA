package com.labThree.springBootStarter.controller;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.domain.PostV2;
import com.labThree.springBootStarter.service.PostService;
import com.labThree.springBootStarter.service.PostV2Service;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    PostV2Service postV2Service;

    @GetMapping()
    public List<Post> getAll() {

        return postService.getAll();
    }

//    @GetMapping(headers = "X-API-VERSION = 2")
//    public List<PostV2> getAllV2() {
//        return postV2Service.getAll();
//    }

    @GetMapping("/{id}")
    public EntityModel<Post> getById(@PathVariable long id) {

        Post post = postService.getById(id);
        EntityModel<Post> resource = EntityModel.of(post);
        //GetAll
        WebMvcLinkBuilder webLinkBuilder = WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
                        .getAll());
        resource.add(webLinkBuilder.withRel("All posts"));
        //Update
        WebMvcLinkBuilder webLinkBuilderUpdate = WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
                        .updateById(new Post(), id));
        resource.add(webLinkBuilderUpdate.withRel("Update posts"));

        //Delete
        WebMvcLinkBuilder webLinkBuilderDelete = WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(this.getClass())
                        .deleteById(id));
        resource.add(webLinkBuilderDelete.withRel("Delete posts"));

        return resource;
    }

    @PostMapping("/addPost")
 public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PutMapping("/{id}")
    public List<Post> updateById(@RequestBody Post post, @PathVariable long id) {
        return postService.updateById(post, id);
    }

    @DeleteMapping("/{id}")
    public List<Post> deleteById(@PathVariable long id) {
        return postService.deleteById(id);
    }
}
