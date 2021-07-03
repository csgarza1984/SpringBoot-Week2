package com.promineotech.jeep2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSales2 {

  public static void main(String[] args) {
    SpringApplication.run(JeepSales2.class, args);
  }

}
