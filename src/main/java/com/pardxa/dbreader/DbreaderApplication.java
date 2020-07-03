package com.pardxa.dbreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.pardxa.dbreader.pojo.InterfaceTbl;

@SpringBootApplication
public class DbreaderApplication extends SpringBootServletInitializer {
//  private final InterfaceTbl ibl;
//
//  public DbreaderApplication(InterfaceTbl ibl) {
//    this.ibl = ibl;
//  }

  public static void main(String[] args) {
    SpringApplication.run(DbreaderApplication.class, args);
    // new DbreaderApplication().configure(new SpringApplicationBuilder(DbreaderApplication.class))
    // .run(args);
  }

}
