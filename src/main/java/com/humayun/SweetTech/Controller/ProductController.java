package com.humayun.SweetTech.Controller;


import com.humayun.SweetTech.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

/*

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
*/

    @RequestMapping(value = "/show")
    public String showAll(Model model) {
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

}
