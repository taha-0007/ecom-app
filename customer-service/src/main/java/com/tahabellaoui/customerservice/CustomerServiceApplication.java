package com.tahabellaoui.customerservice;

import com.tahabellaoui.customerservice.entities.Customer;
import com.tahabellaoui.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamed@gmail.com").build());
            customerRepository.save(Customer.builder().name("Hassan").email("hassan@gmail.com").build());
            customerRepository.save(Customer.builder().name("tttt").email("tttt@gmail.com").build());

            customerRepository.findAll().forEach(c -> {
                System.out.println(c.toString());
            });
        };
    }
}