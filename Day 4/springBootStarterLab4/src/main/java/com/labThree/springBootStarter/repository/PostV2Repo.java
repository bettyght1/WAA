package com.labThree.springBootStarter.repository;

import com.labThree.springBootStarter.domain.PostV2;

import java.util.List;

public interface PostV2Repo {
    public List<PostV2> getAll();

    public PostV2 getById(long id);

    public List<PostV2> updateById(PostV2 post, long id);

    public List<PostV2> deleteById(long id);



}

