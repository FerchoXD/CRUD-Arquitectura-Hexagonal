package Upchiapas.ArquitecturaHexagonal.infrastructure.Repositories;

import Upchiapas.ArquitecturaHexagonal.infrastructure.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Long>{
}
