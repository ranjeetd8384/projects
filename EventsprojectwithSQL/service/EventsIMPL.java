package com.practice.firstproject.service;
import com.practice.firstproject.repository.firstpro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.firstproject.model.User;

@Service
public class EventsIMPL implements Events{
@Autowired
    firstpro obj;
    @Override
    public void addUser(User user){//instead of void to User
        obj.save(user);//User u = obj.save(user);//for inserting data
        // return u; //check record inserted or not

    }
}
