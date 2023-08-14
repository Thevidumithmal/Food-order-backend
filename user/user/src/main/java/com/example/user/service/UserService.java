/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.user.service;

import com.example.user.data.User;
import com.example.user.data.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
     //get all value from user table-------------------------------------------
    public List<User> getAllUser(){
        List<User> user = userRepository.findAll();
        return user;
    }
    
     // create user------------------------------------------------------------
    
    public User createUser(User urd){
       return userRepository.save(urd);
    }
    
     // upadate value  in student table ---------------------------------------
    
    public User updateUser (User urs){
        return userRepository.save(urs);
    
    }
    
    // delete user by id------------------------------------------------------
    
    public void deleteUserById(int id){
        userRepository.deleteById(id);
      
        }
       
    
    
    
    
    
    
    
    
    //delete user by name-----------------------------------------------------
    public void deleteUserByName(String name){
        userRepository.deleteByName(name);
      
        }
    
    //get user details by name
     public List<User> findUserByName(String name){
        List<User> user =  userRepository.findUserByName(name); 
        return user;
    }
}
