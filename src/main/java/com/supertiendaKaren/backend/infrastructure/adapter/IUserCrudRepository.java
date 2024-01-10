package com.supertiendaKaren.backend.infrastructure.adapter;

import com.supertiendaKaren.backend.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {
}
