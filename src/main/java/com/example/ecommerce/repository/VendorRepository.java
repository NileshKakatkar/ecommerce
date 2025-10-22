package com.example.ecommerce.repository;

import com.example.ecommerce.entity.VendorDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorDetails, Long> {
}
