package de.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LocationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(LocationServiceApplication.class, args);
  }
}

