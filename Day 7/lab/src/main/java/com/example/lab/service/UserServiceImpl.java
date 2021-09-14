package com.example.lab.service;

import com.example.lab.domain.Post;
import com.example.lab.domain.User;
import com.example.lab.repository.UserRepo;
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
    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
        @Override
        public Optional<User> getUsersWhoHavePosts(){
            return userRepo.getUsersWhoHavePosts();
        }

        @Override
        public List<User> getAllUsersWithFirstName(String firstName) {
            return userRepo.getAllUsersWithFirstName(firstName);
        }

        @Override
        public List<User> findUserByFullName(String firstName, String secondName) {
            return userRepo.findUserByFullName(firstName, secondName);
        }

    }




