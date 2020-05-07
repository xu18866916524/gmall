package com.shengquan.gmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GmallUserApplication {

	public static void main(String[] args) {
		System.out.println("用户服务启动");
		SpringApplication.run(GmallUserApplication.class, args);
	}

}
