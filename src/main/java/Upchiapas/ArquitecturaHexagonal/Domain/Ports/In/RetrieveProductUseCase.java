package Upchiapas.ArquitecturaHexagonal.Domain.Ports.In;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface RetrieveProductUseCase {
    Optional<Product> GetProduct(Long id);
    List<Product> GetAllProducts();
}
