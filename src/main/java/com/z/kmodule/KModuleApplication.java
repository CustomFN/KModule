package com.z.kmodule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@MapperScan("com.z.kmodule.mybatis.mapper")
public class KModuleApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(KModuleApplication.class, args);
		System.in.read();
	}

}
