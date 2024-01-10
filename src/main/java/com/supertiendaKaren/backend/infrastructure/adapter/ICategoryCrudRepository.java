package com.supertiendaKaren.backend.infrastructure.adapter;

import com.supertiendaKaren.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {
}
