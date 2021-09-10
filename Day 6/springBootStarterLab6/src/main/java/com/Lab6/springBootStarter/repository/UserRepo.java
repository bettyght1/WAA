package com.labSix.springBootStarter.repository;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.domain.User;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepo extends CrudRepository<User, Long> {

    //    a.	GET	localhost:8080/users		 This should retrieve all the users in the database.
    @Query(value = "SELECT u FROM User u")
    public List<User> getAll();
//    b.	GET	localhost:8080/users/1		 This should retrieve the user with id = 1.
    @Query(value ="SELECT u FROM User u WHERE u.id = :id")
    public User getById(long id);
//    c.	POST	localhost:8080/users		 This should create and save a new user.

//    d.	GET	localhost:8080/users/1/posts	 This should retrieve the posts of the user where id = 1.
    @Query(value = "SELECT u.posts FROM User u WHERE u.id = :id")
    public List<Post> getPostsByUser(long id);


}
