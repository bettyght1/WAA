package com.labThree.springBootStarter.repository;

import com.labThree.springBootStarter.domain.Post;

import java.util.List;

public interface PostRepo {
    public List<Post> getAll();

    public Post getById(long id);

}
