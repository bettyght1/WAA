package com.labFive.springBootStarter.repository;

import com.labFive.springBootStarter.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {

}
