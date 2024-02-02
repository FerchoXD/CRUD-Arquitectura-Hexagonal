package Upchiapas.ArquitecturaHexagonal.Domain.Ports.Out;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.AdditionalProductInfo;

public interface ExternalServicePort {
    AdditionalProductInfo getAdditionalProduct(Long id);
}
