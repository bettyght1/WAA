package com.labSix.springBootStarter.repository;

import com.labSix.springBootStarter.domain.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepo extends CrudRepository<Post, Long> {
}
