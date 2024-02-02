package Upchiapas.ArquitecturaHexagonal.Aplication.UseCases;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.RetrieveProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveProductUseCaseImpl implements RetrieveProductUseCase {

    private final ProductRepositoryPort productRepositoryPort;

    public RetrieveProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Optional<Product> GetProduct(Long id) {
        return productRepositoryPort.findById(id);
    }

    @Override
    public List<Product> GetAllProducts() {
        return productRepositoryPort.findAll();
    }
}
