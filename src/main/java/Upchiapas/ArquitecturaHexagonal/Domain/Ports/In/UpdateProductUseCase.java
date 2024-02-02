package Upchiapas.ArquitecturaHexagonal.Domain.Ports.In;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;

import java.util.Optional;

public interface UpdateProductUseCase {

    Optional<Product> updateProduct(Long id, Product updatedProduct);
}
