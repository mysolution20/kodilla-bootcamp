package com.kodillla.patterns2.observer.homework;

public interface StudentsTasksObservable {
    void registerMentorObserver(MentorObserver mentorObserver);
    void removeMentorObserver(MentorObserver mentorObserver);
    void notifyMentorObservers();           // object (Task task) --> .update(this)
}
