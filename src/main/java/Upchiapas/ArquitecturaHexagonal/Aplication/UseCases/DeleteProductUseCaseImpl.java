package Upchiapas.ArquitecturaHexagonal.Aplication.UseCases;

import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.DeleteProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;

public class DeleteProductUseCaseImpl implements DeleteProductUseCase {
    private final ProductRepositoryPort productRepositoryPort;

    public DeleteProductUseCaseImpl(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public boolean DeleteProduct(Long id) {
        return productRepositoryPort.deleteById(id);
    }
}
