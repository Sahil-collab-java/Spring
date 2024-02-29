package com.springH2DataBase.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Integer pid;
    private String name;
    private Double price;
    private Integer qty;
}
