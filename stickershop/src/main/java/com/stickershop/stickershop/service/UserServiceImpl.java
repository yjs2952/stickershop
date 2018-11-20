package com.stickershop.stickershop.service;

import com.stickershop.stickershop.Repository.UserRepository;
import com.stickershop.stickershop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(String id) {
        return userRepository.getOne(id);
    }
}
