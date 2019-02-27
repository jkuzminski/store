package com.store.app.controller;

import com.store.app.model.Customer;
import com.store.app.model.Product;
import com.store.app.service.CustomerService;
import com.store.app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> findAllCustomers() {
        return ResponseEntity.ok(productService.findAllProducts());

    }
}
