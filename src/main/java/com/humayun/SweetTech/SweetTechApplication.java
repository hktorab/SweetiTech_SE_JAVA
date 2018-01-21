package com.humayun.SweetTech;

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

	    @Bean
		CommandLineRunner runner(){
        return args->{
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
