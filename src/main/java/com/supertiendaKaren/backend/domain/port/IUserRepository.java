package com.supertiendaKaren.backend.domain.port;

import com.supertiendaKaren.backend.domain.model.User;

public interface IUserRepository {
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
