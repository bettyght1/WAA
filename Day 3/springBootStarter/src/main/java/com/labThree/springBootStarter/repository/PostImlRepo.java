package com.labThree.springBootStarter.repository;

import com.labThree.springBootStarter.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostImlRepo implements PostRepo {
//    String title;
//    String content;
//    String author
    private List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(001, "Food", "Recipes", "Joe"),
            new Post(002, "Music", "Live performance", "Abebe")
//            new Post(001, "", "", ""),
//            new Post(001, "", "", "")
    ));


    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Post getById(long id) {
        return posts.stream().filter(p->p.getId()==id).findFirst().get();
    }
}
