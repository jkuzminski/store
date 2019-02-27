package com.store.app.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@RequiredArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    Long id;
    String name;
    Double price;

}
