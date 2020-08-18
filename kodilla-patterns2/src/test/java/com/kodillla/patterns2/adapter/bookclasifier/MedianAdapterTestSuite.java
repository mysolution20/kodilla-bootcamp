package com.kodillla.patterns2.adapter.bookclasifier;

import com.kodillla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testGetPublicationLibraryAMedian() {
        //Given
        Book book1 = new Book("Jan Nowak","Bajki na dobranoc",2010,"s/2010/011");
        Book book2 = new Book("Tomasz Man","Bajka na dzień dobry",2011,"s/2011/022");
        Book book3 = new Book("Adam Kos","Bajki dla najmłodszych",2012,"s/2012/033");
        Book book4 = new Book("Adam Lato","Fabulist",2013,"s/2013/044");
        Book book5 = new Book("Adam Zima","Tatry album",2014,"s/2014/055");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationLibraryMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2012, publicationLibraryMedian);
    }
}