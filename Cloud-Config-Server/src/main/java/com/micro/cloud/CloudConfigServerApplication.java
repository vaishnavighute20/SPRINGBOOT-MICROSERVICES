package com.micro.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}
	/*we can fetch  common properties for various microservices from git using cloudconfigserver 
	 http://localhost:6161/ConfigServer/application-default.properties
     use annotation in main class as @EnableConfigServer
     give git link in apllication.properties
	 */
}
