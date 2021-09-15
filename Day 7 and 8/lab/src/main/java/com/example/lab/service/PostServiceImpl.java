package com.example.lab.service;

import com.example.lab.domain.Post;
import com.example.lab.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> getAll() {
        List<Post> posts = new ArrayList<>();
        postRepo.findAll().forEach(posts::add);
        return posts;
    }

    @Override
    public Optional<Post> getById(long id) {
        return postRepo.findById(id);
    }


    @Override
    public void deletePost(long id) {
        postRepo.deleteById(id);
    }

    @Override
    public void addPost(Post post) {
        postRepo.save(post);
    }
}
