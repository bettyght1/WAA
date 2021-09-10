package com.labSix.springBootStarter.service;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PostServiceImpl implements PostService {
    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> getAll() {
        return null;
    }

    @Override
    public Optional<Post> getById(long id) {
        return postRepo.findById(id);
    }

//    @Override
//    public List<Post> findAllById(long id) {
//
//
//        return postRepo.findAllById(id);
//        ;
//
//    }

//    @Override
//    public void updateById(Post post,long id) {
//
//        postRepo.save(id, post);
//    }
//
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
