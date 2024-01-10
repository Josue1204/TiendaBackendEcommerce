package com.supertiendaKaren.backend.infrastructure.config;

import com.supertiendaKaren.backend.application.CategoryService;
import com.supertiendaKaren.backend.application.ProductService;
import com.supertiendaKaren.backend.application.UserService;
import com.supertiendaKaren.backend.domain.port.ICategoryRepository;
import com.supertiendaKaren.backend.domain.port.IProductRepository;
import com.supertiendaKaren.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);
    }
    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }
    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return new ProductService(iProductRepository);
    }
}
