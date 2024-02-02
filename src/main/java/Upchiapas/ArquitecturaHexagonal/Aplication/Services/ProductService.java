package Upchiapas.ArquitecturaHexagonal.Aplication.Services;


import Upchiapas.ArquitecturaHexagonal.Domain.Models.AdditionalProductInfo;
import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements CreateProductUseCase, RetrieveProductUseCase, UpdateProductUseCase, GetAdditionalProductUseCase, DeleteProductUseCase{
    private final CreateProductUseCase createProductUseCase;
    private final RetrieveProductUseCase retrieveProductUseCase;
    private final UpdateProductUseCase updateProductUseCase;
    private final GetAdditionalProductUseCase getAdditionalProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;

    public ProductService(CreateProductUseCase createProductUseCase, RetrieveProductUseCase retrieveProductUseCase, UpdateProductUseCase updateProductUseCase, GetAdditionalProductUseCase getAdditionalProductUseCase, DeleteProductUseCase deleteProductUseCase) {
        this.createProductUseCase = createProductUseCase;
        this.retrieveProductUseCase = retrieveProductUseCase;
        this.updateProductUseCase = updateProductUseCase;
        this.getAdditionalProductUseCase = getAdditionalProductUseCase;
        this.deleteProductUseCase = deleteProductUseCase;
    }

    @Override
    public Product CreateProduct(Product product) {
        return createProductUseCase.CreateProduct(product);
    }
    @Override
    public Optional<Product> updateProduct(Long id, Product updatedProduct) {
        return updateProductUseCase.updateProduct(id, updatedProduct);
    }

    @Override
    public boolean DeleteProduct(Long id) {
        return deleteProductUseCase.DeleteProduct(id);
    }

    @Override
    public AdditionalProductInfo getAdditionalProductInfo(Long id) {
        return getAdditionalProductUseCase.getAdditionalProductInfo(id);
    }

    @Override
    public Optional<Product> GetProduct(Long id) {
        return retrieveProductUseCase.GetProduct(id);
    }

    @Override
    public List<Product> GetAllProducts() {
        return retrieveProductUseCase.GetAllProducts();
    }


}
