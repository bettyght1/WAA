package com.example.labSix.service;

import com.example.labSix.domain1.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();

    public Optional<Post> getById(long id);

    public void deletePost(long id);

    public void addPost(Post post);
}
