package com.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mpy
 *分布式部署场景下，session一致性示例
 *
 *采用redis来实现
 */
@SpringBootApplication
public class SpringSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSessionApplication.class, args);
	}

}
