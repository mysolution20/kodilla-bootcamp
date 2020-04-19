package com.kodilla.stream.book;

import org.junit.*;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
        private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of GetListUsing tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All GetListUsing tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute GetListUsing test #" + testCounter);
    }

    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for(Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .map(n -> 1)
                .sum();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    public void testGetListUsingIntStreamVer2() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }


}
