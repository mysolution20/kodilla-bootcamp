package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FormulasFactory {
    @Bean
    public Formula add(){
        return new AddOperation();
    }
    @Bean
    public Formula sub(){
        return new SubOperation();
    }
    @Bean
    public Formula mul(){
        return new MulOperation();
    }
    @Bean
    public Formula div(){
        return new DivOperation();
    }
}
