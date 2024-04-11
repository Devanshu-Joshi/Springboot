package com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    List<User> list;

    UserService()
    {
        super();
        list = new ArrayList<>();
    }

    public void setUser(User user)
    {
        list.add(user);
    }

    public List<User> getAllUser()
    {
        return list;
    }
}
