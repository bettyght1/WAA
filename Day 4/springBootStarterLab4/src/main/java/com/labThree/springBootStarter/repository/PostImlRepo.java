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
            new Post(1, "Food", "Recipes", "Joe"),
            new Post(2, "Music", "Live performance", "Abebe")
//            new Post(001, "", "", ""),
//            new Post(001, "", "", "")
    ));


    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Post getById(long id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    @Override
    public List<Post> updateById(Post post, long id) {
        for (int i = 0; i <= posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.set(i, post);
                return posts;
            }

    }
        return posts;
    }

    @Override
    public List<Post> deleteById(long id) {
        for (int i = 0; i <= posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.remove(i);
                return posts;
            }
        }
        return posts;
    }

    @Override
    public void addPost(Post post) {
        posts.add(post);
    }
}
