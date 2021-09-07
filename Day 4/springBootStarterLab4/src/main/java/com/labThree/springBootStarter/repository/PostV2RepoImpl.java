package com.labThree.springBootStarter.repository;

import com.labThree.springBootStarter.domain.Post;
import com.labThree.springBootStarter.domain.PostV2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class PostV2RepoImpl implements PostV2Repo {

    private List<PostV2> posts = new ArrayList<>(Arrays.asList(
            new PostV2(1, "Food", "Recipes"),
            new PostV2(2, "Music", "Live performance")
//            new Post(001, "", "", ""),
//            new Post(001, "", "", "")
    ));


    @Override
    public List<PostV2> getAll() {
        return posts;
    }

    @Override
    public PostV2 getById(long id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    @Override
    public List<PostV2> updateById(PostV2 post, long id) {
        for (int i = 0; i <= posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.set(i, post);
                return posts;
            }

        }
        return posts;
    }

    @Override
    public List<PostV2> deleteById(long id) {
        for (int i = 0; i <= posts.size(); i++) {
            if (posts.get(i).getId() == id) {
                posts.remove(i);
                return posts;
            }
        }
        return posts;
    }
}
