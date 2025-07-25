package com.example.bootcrudback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BootCrudBackApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootCrudBackApplication.class, args);
  }

  /*
  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/employees").allowedOrigins("http://localhost:4200");
        registry.addMapping("/employee").allowedOrigins("http://localhost:4200");
        registry.addMapping("/employee/{employeeId}").allowedOrigins("http://localhost:4200");
      }
    };

  }
  */

}
