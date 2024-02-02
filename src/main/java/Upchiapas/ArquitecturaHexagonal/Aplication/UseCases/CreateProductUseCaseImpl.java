package Upchiapas.ArquitecturaHexagonal.Aplication.UseCases;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.CreateProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;

public class CreateProductUseCaseImpl implements CreateProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public CreateProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Product CreateProduct(Product product) {
        return productRepositoryPort.save(product);
    }
}
