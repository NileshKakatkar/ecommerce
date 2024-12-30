package dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductsResponseDTO {
    private Long productId;
    private String productName;
    private Double price;
    private Integer stock;
    private String description;
    private byte[] image;
    private LocalDateTime createdAt;

}
