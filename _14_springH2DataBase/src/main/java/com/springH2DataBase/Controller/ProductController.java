package com.springH2DataBase.Controller;

import com.springH2DataBase.Model.Product;
import com.springH2DataBase.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepo productRepo;


    @GetMapping("/")
    public String loadPage(Model model){
        model.addAttribute("p",new Product());
        List<Product> getAllData =productRepo.findAll();
        model.addAttribute("getAllData",getAllData);
        System.out.println(getAllData);
        return "index";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("p") Product product,Model model){
        product = productRepo.save(product);
        if(product.getPid()!=null){
            model.addAttribute("msg","Data Saved Sucessfulyy........");
        }
        List<Product> getAllData =productRepo.findAll();
        model.addAttribute("getAllData",getAllData);
        System.out.println(getAllData);
        return "index";
    }





}
