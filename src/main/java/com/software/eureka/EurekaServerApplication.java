package com.software.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Eureka主要负责完成微服务架构中的服务治理功能
 * Eureka服务端，我们也称为服务注册中心
 * Eureka客户端，主要处理服务的注册与发现
 * 通过@EnableEurekaServer注解启动一个服务注册中心
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}

/**
 * 服务注册中心：Eureka提供的服务器，提供服务注册于发现的功能，
 * 若设置eureka.client.register-with-eureka=true，则会启动注册操作
 *
 * Eureka中有Region和Zone的概念，一个Region可以包含多个Zone，每个服务客户端都要被注册到一个Zone中，
 * 所以，每个客户端对应一个Region和一个Zone。在进行服务调用的时候，优先访问同处一个Zone的服务提供方，
 * 若访问不到，就访问其他的Zone
 */