package Upchiapas.ArquitecturaHexagonal.Domain.Models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter @Setter
public class Product {
    private Long id;
    private String name;
    private String description;
    private String category;
    private LocalDateTime createdAt;

    public Product(Long id, String name, String description, String category, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.createdAt = createdAt;
    }

}
