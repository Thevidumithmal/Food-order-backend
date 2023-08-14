/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.foodproduct.data;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/**
 *
 * @author GEHAN
 */
@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
    @Query("select p from Product p where p.productName=?1")
    List<Product> findProductByName(String productName);
    
    @Query("select p from Product p where p.productCategory=?1")
    List<Product> findProductByCategory(String productCategory);
    
    @Modifying
    @Query("delete from Product p where p.productName=?1")
    public void deleteByName(String name);
}
