package com.example.lab.service;

import com.example.lab.domain.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();

    public Optional<Post> getById(long id);

    public void deletePost(long id);

    public void addPost(Post post);
}