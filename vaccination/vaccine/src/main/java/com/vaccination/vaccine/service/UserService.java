package com.vaccination.vaccine.service;
import com.vaccination.vaccine.model.UserDetails;

import java.util.List;

public interface UserService {
    void addUser(UserDetails userDetails);
    List<UserDetails> getAllUsers();
}