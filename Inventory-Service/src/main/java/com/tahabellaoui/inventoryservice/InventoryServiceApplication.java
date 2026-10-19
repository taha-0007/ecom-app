package com.tahabellaoui.inventoryservice;

import com.tahabellaoui.inventoryservice.entities.Product; // Attention: entities
import com.tahabellaoui.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            // Plus de UUID ! On laisse la base de données générer l'ID.
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(1000)
                    .quantity(17)
                    .build());

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(3000)
                    .quantity(15)
                    .build());

            productRepository.save(Product.builder()
                    .name("Smart Phone")
                    .price(3500)
                    .quantity(9)
                    .build());

            productRepository.findAll().forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }
}