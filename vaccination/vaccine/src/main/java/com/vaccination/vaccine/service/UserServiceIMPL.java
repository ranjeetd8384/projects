package com.vaccination.vaccine.service;

import com.vaccination.vaccine.Repository.UserRepository;
import com.vaccination.vaccine.model.UserDetails;
// import com.vaccination.vaccine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(UserDetails userDetails) {
        userRepository.save(userDetails);
    }

    @Override
    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }
}
