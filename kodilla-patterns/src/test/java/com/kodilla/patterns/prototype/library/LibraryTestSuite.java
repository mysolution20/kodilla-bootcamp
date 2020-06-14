package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given

        //creating the library and assigning the books
        Library library = new Library("School library No.1.");
        Set<Book> listBooks = new HashSet<>();
        for (int n = 1; n <= 5; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, LocalDate.of(2015 + n, 1, 2));
            listBooks.add(theBook);
        }
        listBooks.forEach(System.out::println);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("School library No.2.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("School library No.3.");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
//        library.getListBooks().remove(listBooks);

        //Then
        System.out.println(library.getName());
        System.out.println(library.getListBooks());
        System.out.println(library.getListBooks().size());
        System.out.println();
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getListBooks());
        System.out.println(clonedLibrary.getListBooks().size());
        System.out.println();
        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getListBooks());
        System.out.println(deepClonedLibrary.getListBooks().size());

    }
}