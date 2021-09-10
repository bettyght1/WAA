package com.labSix.springBootStarter.service;

import com.labSix.springBootStarter.domain.Post;
import com.labSix.springBootStarter.domain.User;
import com.labSix.springBootStarter.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.getAll();
    }

    @Override
    public User getById(long id) {
        return userRepo.getById(id);
    }

    @Override
    public List<Post> getPostsByUser(long id) {
        return getPostsByUser(id);
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);

    }
}
