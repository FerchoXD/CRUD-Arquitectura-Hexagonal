package Upchiapas.ArquitecturaHexagonal.infrastructure.Entities;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

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
    @CreationTimestamp
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
