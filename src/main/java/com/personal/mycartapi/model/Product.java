package com.personal.mycartapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private String brand;
    private String category;
    private Date releaseDate;
    private boolean isAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
