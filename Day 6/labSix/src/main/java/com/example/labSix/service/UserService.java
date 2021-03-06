package com.example.labSix.service;

import com.example.labSix.domain1.Post;
import com.example.labSix.domain1.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAll();

    public Optional<User> getById(long id);

    public List<Post> getPostsByUser(long id);

    public void addUser(User user);

    public List<User> getUsersWhoHavePostsMoreThanOne();
}
