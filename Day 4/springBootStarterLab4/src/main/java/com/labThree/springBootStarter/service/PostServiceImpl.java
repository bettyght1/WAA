package com.labThree.springBootStarter.service;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> getAll() {
        return postRepo.getAll();
    }

    @Override
    public Post getById(long id) {
        return postRepo.getById(id);
    }

    @Override
    public List<Post> updateById(Post post, long id) {
        return postRepo.updateById(post, id);
    }

    @Override
    public List<Post> deleteById(long id) {
        return postRepo.deleteById(id);
    }

    @Override
    public void addPost(Post post) {
        postRepo.addPost(post);
    }
}
