package com._09_Spring_TimeStamp_Custom_Generator.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp_tbl")
@Entity
public class Employee {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    @Column(name = "emp_ID")
    @GenericGenerator(name = "emp_id_gen",strategy = "com._09_Spring_TimeStamp_Custom_Generator.Generator.CustomIdGenerator")
    @GeneratedValue(generator = "emp_id_gen")
    private String empId;
    private String empName;
    private Double empSalary;
    private String empGender;
    private String dept;

    @CreationTimestamp
    @Column(name = "created_date",updatable = false)
    private LocalDate createdDate;

    @UpdateTimestamp
    @Column(name = "updated_date",insertable = false)
    private LocalDate updatedDate;

}
