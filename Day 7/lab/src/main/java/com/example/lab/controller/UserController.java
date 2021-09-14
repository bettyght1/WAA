package com.example.lab.controller;

import com.example.lab.domain.Post;
import com.example.lab.domain.User;
import com.example.lab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable("id") long id) {
        return userService.getById(id);
    }

    @GetMapping("/{id}/posts")

    public List<Post> getPostsByUser(@PathVariable("id") long id) {
        return userService.getPostsByUser(id);
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/posts")
    public List<User> getUsersByPosts() {
        return userService.getUsersWhoHavePostsMoreThanOne();
    }
}

