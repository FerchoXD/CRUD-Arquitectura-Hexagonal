package Upchiapas.ArquitecturaHexagonal.infrastructure.Config;

import Upchiapas.ArquitecturaHexagonal.Aplication.Services.ProductService;
import Upchiapas.ArquitecturaHexagonal.Aplication.UseCases.*;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.GetAdditionalProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ExternalServicePort;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ProductRepositoryPort;
import Upchiapas.ArquitecturaHexagonal.infrastructure.Adapters.ExternalServiceAdapter;
import Upchiapas.ArquitecturaHexagonal.infrastructure.Repositories.JpaProductRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort, GetAdditionalProductUseCase getAdditionalProductUseCase) {
        return new ProductService(
                new CreateProductUseCaseImpl(productRepositoryPort),
                new RetrieveProductUseCaseImpl(productRepositoryPort),
                new UpdateProductUseCaseImpl(productRepositoryPort),
                new DeleteProductUseCaseImpl(productRepositoryPort),
                getAdditionalProductUseCase
        );
    }

    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter) {
        return jpaProductRepositoryAdapter;
    }

    @Bean
    public  GetAdditionalProductUseCase getAdditionalProductUseCase(ExternalServicePort externalServicePort) {
        return new GetAdditionalProductUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort() {
        return new ExternalServiceAdapter();
    }
}
