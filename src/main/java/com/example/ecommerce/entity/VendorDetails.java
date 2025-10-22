package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vendorId;
    
    private String vendorName;
    private String vendorAddress;
    private String vendorEmail;
    private String vendorPassword;
    private String vendorPhone;

    @OneToMany(mappedBy = "vendor" ,cascade = CascadeType.ALL)
    private List<Products> productsList;
}

