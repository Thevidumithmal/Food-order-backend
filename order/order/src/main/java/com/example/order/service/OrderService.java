/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.order.service;

import com.example.order.data.Order;
import com.example.order.data.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dell
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public List <Order> getAllOrder(){
        List<Order>orders = orderRepository.findAll();
        return orders;
    }
    
    
    public Order getOrderById(int id){
        Optional<Order>ord= orderRepository.findById(id);
        return ord.get();
    
    }
    
    
    public Order createOrder (Order ord){
          return orderRepository.save(ord);
    }
    
    
     public Order updateOrder (Order ord){
          return orderRepository.save(ord);
    }
      
     
     public void deleteOrderById (int id){
          orderRepository.deleteById(id);
      } 
      
     
    //delete product using customer name-----------------------------------------
    public void deleteOrderByCustomerName(String name){
        orderRepository.deleteByName(name);
      
    }
    
    //get values from order table using customer name-------------------------
    public List<Order> findOrderByCustomerName(String customerName){
        return orderRepository.findOrderByCustomerName(customerName);
    }
}
