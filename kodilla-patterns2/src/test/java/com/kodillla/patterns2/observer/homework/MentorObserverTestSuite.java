package com.kodillla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MentorObserverTestSuite {

    @Test
    public void testMentorObserverUpdate() {
        // Given
        Task taks01 = new TaskModuleOne(1L,TaskStatus.SENT_FOR_APPROVAL);
        Task taks02 = new TaskModuleOne(2L,TaskStatus.SENT_BACK_FOR_CORRECTION);
        Task taks10 = new TaskModuleTwo(10L,TaskStatus.SENT_FOR_APPROVAL);
        Task taks12 = new TaskModuleTwo(12L,TaskStatus.ACCEPTED);
        Task taks13 = new TaskModuleTwo(13L,TaskStatus.SENT_FOR_APPROVAL);

        FirstMentor firstMentor = new FirstMentor("Adam Kowalczyk");
        SecondMentor secondMentor = new SecondMentor("Grzegorz Tarnowski");

        taks01.registerMentorObserver(firstMentor);
        taks02.registerMentorObserver(secondMentor);
        taks10.registerMentorObserver(firstMentor);
        taks12.registerMentorObserver(secondMentor);
        taks13.registerMentorObserver(secondMentor);

        // When
        taks01.addTask("tekst taks taks01");
        taks02.addTask("tekst taks taks02");
        taks10.addTask("tekst taks taks10");
        taks12.addTask("tekst taks taks12");
        taks13.addTask("tekst taks taks13");

        taks01.getTasks().stream().forEach(System.out::println);


        // Then
//        assertEquals(1, taks13.getRegisteredMentorObservers().size());
    }
}