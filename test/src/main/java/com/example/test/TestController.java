package com.example.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User>  getUser()
    {
        List<User> list = userService.getAllUser();
        return list;
    }

    @GetMapping("/post")
    public String getMethodName(@RequestParam String param) {
        Scanner scanner = new Scanner(System.in);
        User user = new User(scanner.nextInt(),scanner.nextLine(),scanner.nextInt());
        scanner.close();
        userService.setUser(user); 
        return "User Added Successfully";
    }
    
}
 