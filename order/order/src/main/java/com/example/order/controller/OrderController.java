/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.order.controller;

import com.example.order.data.Order;
import com.example.order.service.OrderService;
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
 * @author dell
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    
    //get all values from order table-----------------------------------------
    @GetMapping (path = "/orders")
    public List <Order> getAllOrders(){
    
        return orderService.getAllOrder();
    }
    
    //get value using order id----------------------------------------------
    @GetMapping (path = "/orders/{id}")
    public Order getOrderById (@PathVariable int id) {
        
        return orderService.getOrderById(id);
    }
    
    //create order part-----------------------------------------------------
    @PostMapping (path="/orders")
    public Order createOrder(@RequestBody Order ord){
    
        return orderService.createOrder(ord);
    }
    
    //update order part----------------------------------------------------
    @PutMapping (path="/orders")
    public Order updateOrder(@RequestBody Order ord){
    
        return orderService.updateOrder(ord);
    }
    
    //delete using order id------------------------------------------------
     @DeleteMapping (path = "/orders/{id}")
    public void deleteOrderById (@PathVariable int id){
     
        orderService.deleteOrderById(id);
    }

     //delete order using Customer name-----------------------------------------
     @DeleteMapping(path="/orders",params="name") 
    public void deleteOrderByCustomerName(@RequestParam String name){
        orderService.deleteOrderByCustomerName(name);
         
    }
    
     //get value from order table using customer name---------------------------
    @GetMapping(path = "orders" , params = "customerName")
    public List<Order> findOrderByCustomerName(@RequestParam String customerName){
        return orderService.findOrderByCustomerName(customerName);
    }

}
