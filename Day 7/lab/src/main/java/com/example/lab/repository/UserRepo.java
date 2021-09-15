package com.example.lab.repository;

import com.example.lab.domain.Post;
import com.example.lab.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {
    @Query(value = "SELECT u FROM User u")
    public List<User> getAll();

    @Query(value = "SELECT u.posts FROM User u WHERE u.id = :id")
    public List<Post> getPostsByUser(long id);

    @Query("SELECT u FROM User u WHERE u.posts.size > 1")
    List<User> getUsersWhoHavePostsMoreThanOne();

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    Optional<User> findByUsername(@Param("username") String username);
    @Query(value = "Select * from User where first_name like %:first_name%", nativeQuery = true)
    List<User> getAllUsersWithFirstName(@Param("first_name") String firstName);

    @Query("SELECT u FROM User u WHERE u.firstName = ?1 and u.lastName = ?2")
    List<User> findUserByFullName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    @Query("SELECT u FROM User u WHERE u.posts.size > 1")
    Optional<User> getUsersWhoHavePosts();
}
