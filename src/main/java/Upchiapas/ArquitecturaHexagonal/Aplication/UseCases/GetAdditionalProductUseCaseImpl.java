package Upchiapas.ArquitecturaHexagonal.Aplication.UseCases;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.AdditionalProductInfo;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.In.GetAdditionalProductUseCase;
import Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out.ExternalServicePort;

public class GetAdditionalProductUseCaseImpl implements GetAdditionalProductUseCase {
    private final ExternalServicePort servicePort;

    public GetAdditionalProductUseCaseImpl(ExternalServicePort servicePort) {
        this.servicePort = servicePort;
    }

    @Override
    public AdditionalProductInfo getAdditionalProductInfo(Long id) {
        return servicePort.getAdditionalProduct(id);
    }
}
