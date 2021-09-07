package com.labThree.springBootStarter.service;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.domain.PostV2;
import com.labThree.springBootStarter.repository.PostRepo;
import com.labThree.springBootStarter.repository.PostV2Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PostV2ServiceImpl implements PostV2Service {
    @Autowired
    PostV2Repo postRepo;

    @Override
    public List<PostV2> getAll() {
        return postRepo.getAll();
    }

    @Override
    public PostV2 getById(long id) {
        return postRepo.getById(id);
    }

    @Override
    public List<PostV2> updateById(PostV2 post, long id) {
        return postRepo.updateById(post, id);
    }

    @Override
    public List<PostV2> deleteById(long id) {
        return postRepo.deleteById(id);
    }
}
