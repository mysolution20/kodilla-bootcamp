package com.kodillla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MentorObserverTestSuite {

    @Test
    public void testMentorObserverUpdate() {
        // Given
        Task task24 = new Task(24L, TaskStatus.SENT_FOR_APPROVAL);
        Task task32 = new Task(32L, TaskStatus.SENT_FOR_APPROVAL);
        Task task18 = new Task(18L, TaskStatus.SENT_FOR_APPROVAL);
        Task task11 = new Task(24L, TaskStatus.SENT_FOR_APPROVAL);
        FirstMentor firstMentor = new FirstMentor();
        SecondMentor secondMentor = new SecondMentor();

        // When
        task18.registerMentorObserver(firstMentor);
        task24.registerMentorObserver(secondMentor);
        task11.registerMentorObserver(firstMentor);
        task32.registerMentorObserver(secondMentor);

        // Then
        assertEquals(4, task24.getRegisteredMentorObservers().size());
    }
}