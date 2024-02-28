package com.mapping.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String empName;
    private Double empSalary;

    @OneToMany(mappedBy = "emp" , cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    List<Adress> adressList;

}
