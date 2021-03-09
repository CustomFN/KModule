package com.z.learn.mapstruct.demo02;

import com.z.learn.mapstruct.demo01.UserFrom;
import com.z.learn.mapstruct.demo01.UserTo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestUserConverter extends BaseConverter<UserFrom, UserTo> {

    TestUserConverter INSTANCE = Mappers.getMapper(TestUserConverter.class);

    @Override
    @Mappings({
//            @Mapping(source = "isOver", target = "over"),
//            @Mapping(source = "name", target = "userName"),
            @Mapping(expression = "java(userFrom.getType().getName())", target = "type")
})
    UserTo convertSource2Target(UserFrom userFrom);

    @Override
    @Mappings({
//            @Mapping(source = "over", target = "isOver"),
//            @Mapping(source = "name", target = "userName"),
            @Mapping(expression = "java(com.z.learn.mapstruct.demo01.TypeEnum.getByType(userTo.getType()))", target = "type")
    })
    UserFrom convertTarget2Source(UserTo userTo);
}
