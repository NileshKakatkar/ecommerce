package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartItemId;

    @OneToMany
    @JoinColumn(name= "cartId", referencedColumnName = "cardId")
    private CartItems cartItems;

    @OneToMany
    @JoinColumn(name= "productId", referencedColumnName = "productId")
    private Products products;

    private int quantity;

}
