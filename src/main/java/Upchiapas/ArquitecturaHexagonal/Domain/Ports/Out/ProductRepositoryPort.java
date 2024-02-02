package Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryPort {
    Product save(Product product);
    Optional <Product> findById(Long id);
    List<Product> findAll();
    Optional<Product> update(Long id, Product product);
    boolean deleteById(Long id);

}
