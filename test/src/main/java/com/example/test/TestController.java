package com.example.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser()
    {
        List<User> list = userService.getAllUser();
        return list;
    }

    @GetMapping("/post")
    public String getMethodName() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter sem");
        int sem = scanner.nextInt();
        User user = new User(id,name,sem);
        userService.setUser(user); 
        return "User Added Successfully";
    }
    
}
 