package com.example._16_Spring_Thymleaf_Validation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer pid;
    @NotBlank(message = "Plz enter the product Name....")
    private String name;
    @NotNull(message = "Plz enter the price.....")
    private Double price;
    @NotNull(message = "Plz enter the qty....")
    private Integer qty;

}
