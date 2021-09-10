package com.labFive.springBootStarter.service;

import com.labFive.springBootStarter.domain.Post;
import com.labFive.springBootStarter.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public Iterable<Post> getAll() {
        return postRepo.findAll();
    }

    @Override
    public Optional<Post> getById(long id) {
        return postRepo.findById(id);
    }

    @Override
    public void deletePost(long id) {
         postRepo.deleteById(id);
    }
//
    @Override
    public void addPost(Post post) {
        postRepo.save(post);
    }
}
