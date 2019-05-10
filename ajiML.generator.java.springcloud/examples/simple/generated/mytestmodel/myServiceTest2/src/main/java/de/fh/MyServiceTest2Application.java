package de.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyServiceTest2Application {

  public static void main(String[] args) {
    SpringApplication.run(MyServiceTest2Application.class, args);
  }
}

