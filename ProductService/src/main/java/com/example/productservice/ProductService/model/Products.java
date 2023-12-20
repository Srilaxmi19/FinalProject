package com.example.productservice.ProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Products {
    @Id
    private Integer product_id;
    private String productname;
    private Long productprice;
    private String productdescription;
}
