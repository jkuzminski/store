package com.store.app.service;

import com.store.app.model.Customer;
import com.store.app.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();

}
