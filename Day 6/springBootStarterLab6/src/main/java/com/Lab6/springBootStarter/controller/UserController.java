package com.labSix.springBootStarter.controller;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.domain.User;
import com.labSix.springBootStarter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }
@GetMapping("/{id")
   public User getById(@PathVariable long id){
        return  userService.getById(id);
   }

   @GetMapping("/{id}/posts")
   public List<Post> getPostsByUser(@PathVariable long id){
        return userService.getPostsByUser(id);
   }
@PostMapping("/addUser")
 public void addUser(@RequestBody User user){
     userService.addUser(user);
 }
}

