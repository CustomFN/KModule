package com.z.learn.mapstruct.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
public class UserFrom {

    private Integer id;
    private String name;
    private Boolean isOver;
    private TypeEnum type;

    public UserFrom() {
    }

    public UserFrom(Integer id, String name, Boolean isOver, TypeEnum type) {
        this.id = id;
        this.name = name;
        this.isOver = isOver;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOver() {
        return isOver;
    }

    public void setOver(Boolean over) {
        isOver = over;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
}
