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
}
