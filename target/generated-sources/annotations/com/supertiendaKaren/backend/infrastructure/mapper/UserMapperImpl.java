package com.supertiendaKaren.backend.infrastructure.mapper;

import com.supertiendaKaren.backend.domain.model.User;
import com.supertiendaKaren.backend.infrastructure.entity.UserEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-07T21:59:01-0600",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setId( userEntity.getId() );
        user.setUserName( userEntity.getUserName() );
        user.setLastName( userEntity.getLastName() );
        user.setEmail( userEntity.getEmail() );
        user.setAddress( userEntity.getAddress() );
        user.setCellPhone( userEntity.getCellPhone() );
        user.setPassword( userEntity.getPassword() );
        user.setUserType( userEntity.getUserType() );
        user.setDateCreated( userEntity.getDateCreated() );
        user.setDateUpdate( userEntity.getDateUpdate() );
        user.setFirstName( userEntity.getFirstName() );

        return user;
    }

    @Override
    public Iterable<User> toUser(Iterable<UserEntity> userEntities) {
        if ( userEntities == null ) {
            return null;
        }

        ArrayList<User> iterable = new ArrayList<User>();
        for ( UserEntity userEntity : userEntities ) {
            iterable.add( toUser( userEntity ) );
        }

        return iterable;
    }

    @Override
    public UserEntity toUserEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setUserName( user.getUserName() );
        userEntity.setLastName( user.getLastName() );
        userEntity.setEmail( user.getEmail() );
        userEntity.setAddress( user.getAddress() );
        userEntity.setCellPhone( user.getCellPhone() );
        userEntity.setPassword( user.getPassword() );
        userEntity.setUserType( user.getUserType() );
        userEntity.setDateCreated( user.getDateCreated() );
        userEntity.setDateUpdate( user.getDateUpdate() );
        userEntity.setFirstName( user.getFirstName() );

        return userEntity;
    }
}
