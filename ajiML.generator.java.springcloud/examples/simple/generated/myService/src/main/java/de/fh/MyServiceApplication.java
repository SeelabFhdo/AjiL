package de.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(MyServiceApplication.class, args);
  }
}

