/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.user.data;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{
    
    @Modifying
    @Query("delete from User u where u.fullName=?1")
    public void deleteByName(String name);
    
    @Query("select u from User u where u.fullName=?1")
    List<User> findUserByName(String name);
    
}
