package com.kodilla.testing.library;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of Library tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All Library tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute Library test #" + testCounter);
    }


    @Test
    public void testListOf0BooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Adam", "Kowal", "123");
        List<Book> books = new ArrayList<>();

        //When
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //Then
        Assert.assertEquals(0, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }

    @Test
    public void testListOf1BooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser libraryUser = new LibraryUser("Adam", "Kowal", "123");
        Book book1 = new Book("W pustyni i na skale", "Heniek Kowal", 2000);

        List<Book> books = new ArrayList<>();
        books.add(book1);

        //When
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //Then
        Assert.assertEquals(1, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }

    @Test
    public void testListOf5BooksInHandsOf() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser libraryUser = new LibraryUser("Adam", "Kowal", "123");

        Book book1 = new Book("W pustyni i na skale", "Heniek Kowal", 2000);
        Book book2 = new Book("Książka kucharska tom 1", "Danuta Nowak", 2010);
        Book book3 = new Book("Książka kucharska tom 2", "Danuta Nowak", 2011);
        Book book4 = new Book("Książka kucharska tom 3", "Danuta Nowak", 2012);
        Book book5 = new Book("Książka kucharska tom 4", "Danuta Nowak", 2013);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        //When
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(books);

        //Then
        Assert.assertEquals(5, bookLibrary.listBooksInHandsOf(libraryUser).size());
    }


    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks =
                bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionMoreThan20() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);

        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);

        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);


        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {

        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);

        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        //When
        List<Book> theListOf10Books = bookLibrary.listBooksWithCondition("An");

        //Then
        assertEquals(0, theListOf10Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
}
