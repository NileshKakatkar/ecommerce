package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name="cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @Column(name="cartId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartID;

   @ManyToOne
   @JoinColumn(name="userId", nullable = false)
   private Users user;

   @ManyToOne
   @JoinColumn(name="productId", nullable = false)
   private Products product;

   @Column(name="quantity", nullable = false)
   private Integer quantity;

   @Column(name="price", nullable = false)
   private Double price;

    @Column(name="createAt",nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.price=calculatePrice();
    }

    public double calculatePrice(){
        return quantity* product.getPrice();
    }
}
