package com.humayun.SweetTech;

import com.humayun.SweetTech.Repository.AdminRepository;
import com.humayun.SweetTech.Repository.ProductCategoryRepository;
import com.humayun.SweetTech.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SweetTechApplication {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;
    @Autowired
    private AdminRepository adminRepository;
    @Bean
    CommandLineRunner runner(){
        return args->{
//            Admin admin=new Admin(1,"admin","admin");
//            adminRepository.save(admin);
//

//            for (int i = 0; i < list2.size(); i++) {
//                System.out.println(list2.get(i).getProductCategoryName());
//            }


//			ProductCategory productCategory=new ProductCategory(1,"MotherBoard");
//			ProductCategory productCategory2=new ProductCategory(2,"RAM");
//			ProductCategory productCategory3=new ProductCategory(3,"Graphics Card");
//			productCategoryRepository.save(productCategory);
//			productCategoryRepository.save(productCategory2);
//			productCategoryRepository.save(productCategory3);
            //Product product =new Product(2,"M63","MotherBoard","MotherBoard v4",3000.3);
            //productRepository.save(product);
            //   System.out.println("done");
            //System.out.println(studenRepository.findById("999"));
            //System.out.println(studenRepository.findStudentByName("Torab"));
            //  studenRepository.findStudentByCgpaGreaterThanEqual(3.01).forEach(System.out::println);
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(SweetTechApplication.class, args);
    }
}
