package com.platzi.store.persistence.mapper;

import com.platzi.store.domain.PurchaseItem;
import com.platzi.store.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "total", target = "total"), // si se llaman igual no es necesario mapear
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto comprasProducto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "id.idCompra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "compra", ignore = true),
    })
    ComprasProducto toComprasProducto(PurchaseItem purchaseItem);
}
