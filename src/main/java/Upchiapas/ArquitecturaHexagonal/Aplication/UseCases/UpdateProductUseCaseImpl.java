package Upchiapas.ArquitecturaHexagonal.Aplication.UseCases;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.UpdateProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;
import java.util.Optional;

public class UpdateProductUseCaseImpl implements UpdateProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public UpdateProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        return productRepositoryPort.update(id, updatedProduct);
    }
}
