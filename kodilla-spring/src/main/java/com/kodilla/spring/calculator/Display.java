package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Display {
    FormulasFactory formulasFactory;

    public Display(FormulasFactory formulasFactory) {
        this.formulasFactory = formulasFactory;
    }

    public FormulasFactory getFormulasFactory() {
        return formulasFactory;
    }

    @Bean
    public void displayValue(){
        System.out.println("Displaying value: "+ getFormulasFactory() );
    }

}
