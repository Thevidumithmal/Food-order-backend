/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodproduct.service;

import com.example.foodproduct.data.Product;
import com.example.foodproduct.data.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author GEHAN
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    //get all values in product table-------------------------------------------
    public List<Product> getAllProduct(){
        List<Product> product = productRepository.findAll();
        return product;
    }
    
    //get product values by product id------------------------------------------
    public Product getProductById(int id){
        Optional<Product> product=productRepository.findById(id);
        return product.get();
    }
    
    //add product part---------------------------------------------------------
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    
    //update product part----------------------------------------------------
    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
    
    //delete product using product id-----------------------------------------
    public void deleteProductById(int id){
       productRepository.deleteById(id);
    }
    
    //delete product using product name-----------------------------------------
    public void deleteProductByName(String name){
        productRepository.deleteByName(name);
      
    }
    
    //get values from product table using product name-------------------------
    public List<Product> findProductByName(String productName){
        return productRepository.findProductByName(productName);
    }
    
    //get values from product table using product category----------------------
    public List<Product> findProductByCategory(String productCategory){
        return productRepository.findProductByCategory(productCategory);
    }

}
