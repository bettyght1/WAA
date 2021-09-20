package com.example.labSix.service;

import com.example.labSix.domain1.Post;
import com.example.labSix.domain1.User;
import com.example.labSix.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.getAll();
    }

    @Override
    public Optional<User> getById(long id) {
        return userRepo.findById(id);
    }

    @Override
    public List<Post> getPostsByUser(long id) {
        return userRepo.getPostsByUser(id);
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public List<User> getUsersWhoHavePostsMoreThanOne() {
        return userRepo.getUsersWhoHavePostsMoreThanOne();
    }
}
