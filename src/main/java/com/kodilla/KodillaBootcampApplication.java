package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaBootcampApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaBootcampApplication.class, args);

        Calculator calculator = new Calculator();
        calculator.AddValues();
        calculator.SubtractValues();

    }

}
