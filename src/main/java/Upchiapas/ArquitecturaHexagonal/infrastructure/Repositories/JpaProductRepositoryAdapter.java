package Upchiapas.ArquitecturaHexagonal.infrastructure.Repositories;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.Product;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;
import Upchiapas.ArquitecturaHexagonal.infrastructure.Entities.ProductEntity;

import java.util.List;
import java.util.Optional;

public class JpaProductRepositoryAdapter implements ProductRepositoryPort {
    private final JpaProductRepository jpaProductRepository;

    public JpaProductRepositoryAdapter(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = ProductEntity.fromDomainiModel(product);
        ProductEntity savedProductEntity = jpaProductRepository.save(productEntity);
        return savedProductEntity.toDomainModel();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return jpaProductRepository.findById(id).map(ProductEntity::toDomainModel);
    }

    @Override
    public List<Product> findAll() {
        return jpaProductRepository.findAll()
                .stream()
                .map(ProductEntity::toDomainModel)
                .toList();
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        if (jpaProductRepository.existsById(id)) {
            ProductEntity productEntity = ProductEntity.fromDomainiModel(product);
            productEntity.setId(id);
            ProductEntity updatedProductEntity = jpaProductRepository.save(productEntity);
            return Optional.of(updatedProductEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaProductRepository.existsById(id)) {
            jpaProductRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
