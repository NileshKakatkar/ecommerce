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

    @ManyToMany
    @Column(name="userID", nullable = false)
    private Users user;

    @ManyToMany
    @Column(name="productID", nullable = false)
    private Products product;

    @Column(name="createAt",nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();


}
