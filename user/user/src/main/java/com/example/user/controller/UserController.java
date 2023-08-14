/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.user.controller;

import com.example.user.data.User;
import com.example.user.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    // for get all values from user table--------------------------------------
    @GetMapping(path="/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
    
      // for Create user part--------------------------------------------------
    @PostMapping(path="/users")
    public User createUser(@RequestBody User urd){
        return userService.createUser(urd);
    }
    
     // for update in user table----------------------------------------------
    @PutMapping(path="/users")
    public User updateStudent(@RequestBody User user){
        return userService.updateUser(user);
    }
    
    //delete user in user table by id-----------------------------------------
     @DeleteMapping(path="/users/{id}") 
    public void deleteUserById(@PathVariable int id){
         userService.deleteUserById(id);
    
    }
    
    
    
    
    
    // delete user by name-----------------------------------------------------
    @DeleteMapping(path="/users",params="name") 
    public void deleteUserById(@RequestParam String name){
        userService.deleteUserByName(name);
         
    }
    
     // get user values by name---
     @GetMapping(path="/users",params="name") // 
    public List<User> findStudentByName(@RequestParam String name)
    {
         return userService.findUserByName(name);
    }
}
