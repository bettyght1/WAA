package com.labThree.springBootStarter.service;

import com.labThree.springBootStarter.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PostService {
    public List<Post> getAll();

    public Post getById(long id);

}
