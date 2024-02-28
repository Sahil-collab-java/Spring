package com.example._08_springDataJPA.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    private Integer bookID;
    private String bookName;
    private Double bookPrice;

}
