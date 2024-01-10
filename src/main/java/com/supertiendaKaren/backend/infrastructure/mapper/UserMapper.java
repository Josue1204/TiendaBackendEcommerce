package com.supertiendaKaren.backend.infrastructure.mapper;

import com.supertiendaKaren.backend.domain.model.User;
import com.supertiendaKaren.backend.infrastructure.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings(
            {
                    @Mapping(source = "id",target = "id"),
                    @Mapping(source = "userName",target = "userName"),
                    @Mapping(source = "lastName",target = "lastName"),
                    @Mapping(source = "email",target = "email"),
                    @Mapping(source = "address",target = "address"),
                    @Mapping(source = "cellPhone",target = "cellPhone"),
                    @Mapping(source = "password",target = "password"),
                    @Mapping(source = "userType",target = "userType"),
                    @Mapping(source = "dateCreated",target = "dateCreated"),
                    @Mapping(source = "dateUpdate",target = "dateUpdate")
            }
    )
    User toUser(UserEntity userEntity);
    Iterable<User>toUser(Iterable<UserEntity> userEntities);
     @InheritInverseConfiguration  //invertira los valores para ya no volver a escribirlos
    UserEntity toUserEntity(User user);
}
