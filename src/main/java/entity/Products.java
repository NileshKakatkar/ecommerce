package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name="products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name="productName", nullable = false, unique = true)
    private String productName;

    @Column(name="stock", nullable = false)
    private int stock;

    @Column(name="price", nullable = false)
    private double price;

    @Column(name="description")
    private String description;

    @Lob
    @Column(name="image", nullable = false)
    private byte[] image;

    @Column(name="createdAt",nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name="category", nullable = false)
    private Category category;

}
