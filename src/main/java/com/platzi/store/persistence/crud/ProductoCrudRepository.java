package com.platzi.store.persistence.crud;

import com.platzi.store.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoria(int idCategoria);
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByIdCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
