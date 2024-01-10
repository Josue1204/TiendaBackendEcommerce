package com.supertiendaKaren.backend.domain.port;

import com.supertiendaKaren.backend.domain.model.Product;

public interface IProductRepository {
    Product save(Product product);
    Iterable<Product>findAll();
    Product findById(Integer id);
    void deleteById(Integer id);

}
