package Upchiapas.ArquitecturaHexagonal.infrastructure.Entities;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter @Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String category;
    private LocalDateTime createdAt;

    public ProductEntity() {}

    public ProductEntity(Long id, String name, String description, String category, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.createdAt = createdAt;
    }

    public static ProductEntity fromDomainiModel(Upchiapas.ArquitecturaHexagonal.Domain.Models.Product product) {
        return new ProductEntity(product.getId(), product.getName(), product.getDescription(), product.getCategory(), product.getCreatedAt());
    }

    public Product toDomainModel() {
        return new Product(this.id, this.name, this.description, this.category, this.createdAt);
    }
}
