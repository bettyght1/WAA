package com.labSix.springBootStarter.service;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.domain.User;

import java.util.List;

public interface UserService {
    public List<User> getAll();

    public User getById(long id);

    public List<Post> getPostsByUser(long id);

    public void addUser(User user);
}
