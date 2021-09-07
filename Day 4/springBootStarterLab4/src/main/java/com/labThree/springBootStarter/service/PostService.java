package com.labThree.springBootStarter.service;

import com.labThree.springBootStarter.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostService {
    public List<Post> getAll();

    public Post getById(long id);

    public List<Post> updateById(Post post, long id);

    public List<Post> deleteById(long id);

   public void addPost(Post post);
}
