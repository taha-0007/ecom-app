package com.tahabellaoui.inventoryservice.entities; // Attention: entities

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder @ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // L'ID sera 1, 2, 3...
    private Long id;

    private String name;
    private double price;
    private int quantity;
}