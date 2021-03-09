package com.z.kmodule.validate;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class TestVo {

    @Comment("年龄")
    @NotNull(message = "请输入年龄")
    @Pattern(regexp = "[1-99]", message = "请输入正确格式年龄")
    private String age;

    @Comment("姓名")
    @NotBlank(message = "请输入姓名")
    private String name;

    @Pattern(regexp = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", message = "请输入正确邮箱")
    private String email;
}
