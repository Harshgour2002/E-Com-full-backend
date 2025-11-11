package com.example.E_commerce.E_commerce.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "product_images")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    private boolean primaryImage = false;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

