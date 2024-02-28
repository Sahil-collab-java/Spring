package com.example._16_Spring_Thymleaf_Validation.Controller;

import com.example._16_Spring_Thymleaf_Validation.Model.Product;
import com.example._16_Spring_Thymleaf_Validation.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/")
    public String loadPage(Model model){
        model.addAttribute("product",new Product());
        return "index";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@Validated @ModelAttribute("product") Product product, BindingResult result, Model model ){

        if(result.hasErrors()){
            return "index";
        }

        product = productRepo.save(product);
        if(product.getPid()!=null){
            model.addAttribute("msg","Save SucessFull.......");
        }
        return "index";
    }

    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("getAllProduct",productRepo.findAll());
        return "data";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("pid") Integer pid,Model model){
        productRepo.deleteById(pid);
        model.addAttribute("msg","Record Deleted SucessFully.....");
        model.addAttribute("getAllProduct",productRepo.findAll());
        return "data";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("pid") Integer pid,Model model){

     Optional<Product> product = productRepo.findById(pid);
     if(product.isPresent()){
         model.addAttribute("product",product);
     }
        return "index";
    }



}
