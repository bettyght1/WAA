package com.labFive.springBootStarter.service;

import com.labFive.springBootStarter.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public Iterable<Post> getAll();

    public Optional<Post> getById(long id);

    public void deletePost(long id);

   public void addPost(Post post);
}
