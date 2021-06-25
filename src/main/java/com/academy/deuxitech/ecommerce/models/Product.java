package com.academy.deuxitech.ecommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private String id;

    private String name;
    private double price;
    private String description;
    private boolean in_stock;
    private int serial_number;


}
