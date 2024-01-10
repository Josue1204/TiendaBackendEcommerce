package com.supertiendaKaren.backend.infrastructure.adapter;

import com.supertiendaKaren.backend.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface IProductCrudRepository extends CrudRepository<ProductEntity,Integer> {
}
