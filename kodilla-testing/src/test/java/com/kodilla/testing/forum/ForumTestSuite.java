package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");
        //When
        String result = simpleUser.getUserName();
        System.out.println(" ******* Testing UserName: " + result + " ******* ");
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jan Kowalski");
        //When
        String result = simpleUser.getRealName();
        System.out.println(" ******* Testing RealName: " + result + " ******* ");
        //Then
        Assert.assertEquals("Jan Kowalski", result);
    }

}
