package com.kodillla.patterns2.adapter.bookclasifier;

import com.kodillla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodillla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodillla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    /**
     *   a d o p t u j ą c y
     */
MedianAdaptee medianAdaptee = new MedianAdaptee();
TypeConverter typeConverter = new TypeConverter();

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodillla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book book : bookSet) {
            books.put(typeConverter.signatureConvert(book), typeConverter.bookConvert(book));
        }
        return medianAdaptee.medianPublicationYear(books);
    }
}
