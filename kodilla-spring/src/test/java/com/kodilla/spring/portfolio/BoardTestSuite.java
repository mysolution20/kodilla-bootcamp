package com.kodilla.spring.portfolio;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of tasks tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All boards tasks are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute task test #" + testCounter);
    }

    @Test
    public void testTaskAdd() {
//        Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
//        When
        String taskListInDone = board.getDoneList();
        String taskListInProgress = board.getInProgressList();
        String taskListToDo = board.getToDoList();
//        Then
        Assert.assertEquals("Task No.1, done and Task No.4, done", taskListInDone);
        Assert.assertEquals("Task No.2, in progress and Task No.5, in progress", taskListInProgress);
        Assert.assertEquals("Task No.3, to do and Task No.6, to do", taskListToDo);
        System.out.println();
        System.out.println("Tasks done: " + taskListInDone +","+ "\nand tasks in progress: " + taskListInProgress+","+
                 "\nand tasks to do: " + taskListToDo + ".");
    }
}
