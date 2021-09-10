package com.labSix.springBootStarter.service;

import com.labSix.springBootStarter.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<Post> getAll();

    public Optional<Post> getById(long id);

   // public void updateById(Post post, long id);

    public void deletePost(long id);

   public void addPost(Post post);
}
