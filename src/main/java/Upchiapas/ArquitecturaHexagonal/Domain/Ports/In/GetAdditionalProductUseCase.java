package Upchiapas.ArquitecturaHexagonal.Domain.Ports.In;

import Upchiapas.ArquitecturaHexagonal.Domain.Models.AdditionalProductInfo;

public interface GetAdditionalProductUseCase {
    AdditionalProductInfo getAdditionalProductInfo(Long id);
}
