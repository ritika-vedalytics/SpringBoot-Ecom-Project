package com.ritika.ecom_proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private boolean available;
    private int quantity;
}
