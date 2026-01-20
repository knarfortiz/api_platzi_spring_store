package com.platzi.store.persistence.mapper;

import com.platzi.store.domain.Purchase;
import com.platzi.store.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
    @Mappings({
            @org.mapstruct.Mapping(source = "idCompra", target = "purchaseId"),
            @org.mapstruct.Mapping(source = "idCliente", target = "clientId"),
            @org.mapstruct.Mapping(source = "fecha", target = "date"),
            @org.mapstruct.Mapping(source = "medioPago", target = "paymentMethod"),
            @org.mapstruct.Mapping(source = "comentario", target = "comment"),
            @org.mapstruct.Mapping(source = "estado", target = "state"),
            @org.mapstruct.Mapping(source = "comprasProductos", target = "purchaseItems")
    })
    Purchase toPurchase(Compra compra);

    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Purchase purchase);
}
