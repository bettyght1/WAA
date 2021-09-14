package com.example.lab.service;

import com.example.lab.domain.Post;
import com.example.lab.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAll();

    public Optional<User> getById(long id);

    public List<Post> getPostsByUser(long id);

    public void addUser(User user);

    public List<User> getUsersWhoHavePostsMoreThanOne();


    Optional<User> findByUsername(String username);

   Optional<User> getUsersWhoHavePosts();

    List<User> getAllUsersWithFirstName(String firstName);

    List<User> findUserByFullName(String firstName, String lastName);
}
