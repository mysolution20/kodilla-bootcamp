package com.kodillla.patterns2.adapter.bookclasifier;

import com.kodillla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodillla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

public class TypeConverter {
    /**
     * 1.
     * Book = {signature, autor, tytuł, rok }     <-- bookFromLibraryA
     * Set <Book> bookSet
     * 2.
     * Book = {autor, tytuł, rok}                 <-- bookFromLibraryB
     * BookSignature = { signature }
     * Map.Entry<BookSignature, Book> entry : books.entrySet()
     */
    public com.kodillla.patterns2.adapter.bookclasifier.libraryb.Book bookConvert(Book bookFromLibraryA) {

        String author = bookFromLibraryA.getAuthor();
        String title = bookFromLibraryA.getTitle();
        int year = bookFromLibraryA.getPublicationYear();

        com.kodillla.patterns2.adapter.bookclasifier.libraryb.Book bookFromLibraryB;
        bookFromLibraryB = new com.kodillla.patterns2.adapter.bookclasifier.libraryb.Book(author, title, year);

        return bookFromLibraryB;
    }

    public com.kodillla.patterns2.adapter.bookclasifier.libraryb.BookSignature signatureConvert(Book bookFromLibraryA) {

        String signature = bookFromLibraryA.getSignature();
        return new BookSignature(signature);
    }

}

