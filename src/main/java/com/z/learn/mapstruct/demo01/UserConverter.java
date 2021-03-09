package com.z.learn.mapstruct.demo01;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);


//    @Mappings({
//            @Mapping(source = "isOver", target = "over")
//    })
    UserTo convertFrom2To(UserFrom userFrom);
}
