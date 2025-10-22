package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private Double price;
    private String desc;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "vendorId", referencedColumnName = "vendorId")
    private VendorDetails vendor;

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    private Categories categories;

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Products> products;

}
