package Upchiapas.ArquitecturaHexagonal.Domain.Models;

import lombok.Getter;

@Getter
public class AdditionalProductInfo {
    private final Long id;
    private final String name;
    private final String email;

    public AdditionalProductInfo(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
