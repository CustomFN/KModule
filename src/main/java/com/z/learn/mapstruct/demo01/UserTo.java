package com.z.learn.mapstruct.demo01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class UserTo {

     private Integer id;
     private String name;
     private Boolean isOver;
     private String type;


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

     public Boolean getIsOver() {
          return isOver;
     }

     public void setIsOver(Boolean over) {
          isOver = over;
     }

     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
