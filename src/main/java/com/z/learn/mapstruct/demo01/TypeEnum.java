package com.z.learn.mapstruct.demo01;

import lombok.Data;

public enum TypeEnum {

    TYPE_A("1", "type_a"),
    TYPE_B("2", "type_b"),
    TYPE_C("3", "type_c"),
    ;

    private String id;
    private String name;

    TypeEnum(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static TypeEnum getByType(String type) {
        for (TypeEnum typeEnum : values()) {
            if (typeEnum.getName().equals(type)) {
                return typeEnum;
            }
        }
        return null;
    }
}
