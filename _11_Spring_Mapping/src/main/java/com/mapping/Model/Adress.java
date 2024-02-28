package com.mapping.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addrId;
    private String city;
    private String state;
    private String country;


    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee emp;
}
