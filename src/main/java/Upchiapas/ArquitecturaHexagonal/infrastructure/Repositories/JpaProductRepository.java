package Upchiapas.ArquitecturaHexagonal.infrastructure.Repositories;

import Upchiapas.ArquitecturaHexagonal.infrastructure.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<ProductEntity, Long>{
}
