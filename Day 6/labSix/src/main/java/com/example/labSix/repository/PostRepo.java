package com.example.labSix.repository;

import com.example.labSix.domain1.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

}
