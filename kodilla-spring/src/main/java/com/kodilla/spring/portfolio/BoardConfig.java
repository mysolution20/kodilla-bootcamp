package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Bean
    public Board getTaskList() {
        return new Board(taskList(), taskList(), taskList());
    }

    @Bean
    public TaskList taskList() {
        return new TaskList();
    }
}
