package com.labThree.springBootStarter.repository;

import com.labThree.springBootStarter.domain.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> getAll();

    public Post getById(long id);

    public List<Post> updateById(Post post, long id);

    public List<Post> deleteById(long id);

    public void addPost(Post post);
}
