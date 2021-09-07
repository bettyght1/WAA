package com.labThree.springBootStarter.service;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.domain.PostV2;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostV2Service {
    public List<PostV2> getAll();

    public PostV2 getById(long id);

    public List<PostV2> updateById(PostV2 post, long id);

    public List<PostV2> deleteById(long id);
}
