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
public class DeliveryAddress {

    @Id
    private String id;

    private String street;
    private String zipcode;
    private String city;
    private String country;
}
