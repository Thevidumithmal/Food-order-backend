/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.order.data;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */
@Repository
@Transactional
public interface OrderRepository extends JpaRepository <Order, Integer> {

    @Modifying
    @Query("delete from Order o where o.customerName=?1")
    public void deleteByName(String name);
    
    @Query("select o from Order o where o.customerName=?1")
    List<Order> findOrderByCustomerName(String customerName);
}
