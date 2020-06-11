package com.kodilla.spring.forum;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of users tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All users tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute user test #" + testCounter);
    }

    @Test
    public void testForumUserShouldHaveUserNameEqualsJohnSmith() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String name = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", name);
    }
}