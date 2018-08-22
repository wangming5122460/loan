package com.easyloan.contract;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.easyloan")
@MapperScan(basePackages = "com.easyloan.contract.mapper")
public class CompactContractWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompactContractWebApplication.class, args);
	}

}
