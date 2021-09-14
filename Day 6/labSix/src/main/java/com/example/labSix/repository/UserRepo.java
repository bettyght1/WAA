package com.example.labSix.repository;

import com.example.labSix.domain.Post;
import com.example.labSix.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {
    @Query(value = "SELECT u FROM User u")
    public List<User> getAll();

    @Query(value = "SELECT u.posts FROM User u WHERE u.id = :id")
    public List<Post> getPostsByUser(long id);

    @Query("SELECT u FROM User u WHERE u.posts.size > 1")
    List<User> getUsersWhoHavePostsMoreThanOne();

}
