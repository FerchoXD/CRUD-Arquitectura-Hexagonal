package Upchiapas.ArquitecturaHexagonal.Domain.Models;

import lombok.Getter;

@Getter
public class AdditionalProductInfo {
    private final Long id;
    private final String name;
    private final String description;
    private final String category;
    private final String createdAt;

    public AdditionalProductInfo(Long id, String name, String description, String category, String createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.createdAt = createdAt;
    }
}
