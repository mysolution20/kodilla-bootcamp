package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given

        //creating the library and assigning the books
        Library library = new Library("School library No.1.");
        for (int n = 1; n <= 5; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, LocalDate.of(2015 + n, 1, 2));
            library.getListBooks().add(theBook);
        }
//         library.getListBooks().forEach(System.out::println);

        // making a shallow clone of object library
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
//        library.getListBooks().clear();

//      Book{title='Title 5', author='Author 5', publicationDate=2020-01-02}
        Book bookToRemove = new Book("Title 5","Author 5",LocalDate.of(2020,1,2));
        library.getListBooks().remove(bookToRemove);

        //Then
        Assert.assertEquals(4, library.getListBooks().size());
        Assert.assertEquals(4, clonedLibrary.getListBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getListBooks().size());
        Assert.assertEquals(clonedLibrary.getListBooks(), library.getListBooks());
        Assert.assertNotEquals(deepClonedLibrary.getListBooks(), library.getListBooks());
    }
}