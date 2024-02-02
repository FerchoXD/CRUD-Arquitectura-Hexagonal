package Upchiapas.ArquitecturaHexagonal.Domain.Ports.In;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;

public interface CreateProductUseCase {
    Product CreateProduct(Product product);

}
