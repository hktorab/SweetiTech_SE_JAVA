package com.humayun.SweetTech.Controller;


import com.humayun.SweetTech.Model.Product;
import com.humayun.SweetTech.Model.ProductCategory;
import com.humayun.SweetTech.Repository.ProductCategoryRepository;
import com.humayun.SweetTech.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    public ProductRepository productRepository;
    @Autowired
    public ProductCategoryRepository productCategoryRepository;

    @RequestMapping(value = "/")
    public String showAll(Model model) {
        model.addAttribute("product", productRepository.findAll());
        // model.addAttribute( "count",productRepository.count());
        return "index";

    }
    @RequestMapping(value = "/show")
    public String showAlls(Model model) {
        model.addAttribute( "product",productRepository.findAll());
        // model.addAttribute( "count",productRepository.count());
        return "index";
    }
    @RequestMapping(value = "/product/{id}")
    public String showSingleProduct(@PathVariable int id, Model model){
        model.addAttribute("product",productRepository.findByProductId(id));
        model.addAttribute( "count",productRepository.count());
        return "ShowProduct";
    }



    @GetMapping(value = "/addproduct")
    public ModelAndView addProduct() {
        ModelAndView modelAndView = new ModelAndView("AddProduct");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("Category", allProductCategory());
        long id=productRepository.count();
        id++;
        System.out.println(id);
        modelAndView.addObject("Count",id);
        return modelAndView;
    }

    private List<String> allProductCategory() {
        List<String> list = new ArrayList<>();
//        list.add("MotherBoard");
//        list.add("Ram");
//        list.add("Graphics Card");


        List<ProductCategory> list2=productCategoryRepository.findAll();



        for (int i = 0; i < list2.size(); i++) {
            list.add(list2.get(i).getProductCategoryName());
        }
        return list;
    }


    @PostMapping("/addproduct")
    public ModelAndView  addProduct(@Valid Product product, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (result.hasErrors()) {
            modelAndView.setViewName("addproduct");
            modelAndView.addObject("product", product);
            modelAndView.addObject("allCategory", allProductCategory());
            return modelAndView;
        }
        productRepository.save(product);
        modelAndView.setViewName("ShowProduct");
        return modelAndView;
    }
}
