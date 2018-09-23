package de.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyServiceTest3Application {

  public static void main(String[] args) {
    SpringApplication.run(MyServiceTest3Application.class, args);
  }
}

