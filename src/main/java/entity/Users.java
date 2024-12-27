package entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId", nullable = false, unique = true)
    private Long userId;

    @Column(name="userName", nullable = false, unique = true)
    private String userName;

    @Column(name="email",nullable = false, unique = true)
    private String email;

    @Column(name="password", nullable = false, unique = true)
    private String password;

    @Column(name="createdAt",nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
