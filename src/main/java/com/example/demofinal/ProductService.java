package com.example.demofinal;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public boolean addProduct(Product product){
        try {
            repository.insert(product);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean updateProduct(Product product) {
        try {
            repository.save(product);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean deleteProduct(Product product) {
        try {
            repository.delete(product);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public List<Product> getAllProduct() {
        try {
            return repository.findAll();
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public Product getProductByName(String productName) {
        try {
            return repository.findByName(productName);
        } catch (Exception e){
            return null;
        }
    }




}
