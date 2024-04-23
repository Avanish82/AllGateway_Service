package com.javatpoint.microservices.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;



//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableZuulProxy   
//@EnableHystrix //add 30/12/2023
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class NetflixZuulApiGatewayServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}
}