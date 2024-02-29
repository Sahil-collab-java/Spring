package com.example._16_Spring_Thymleaf_Validation.Repo;

import com.example._16_Spring_Thymleaf_Validation.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


}
