package com.kodillla.patterns2.adapter.bookclasifier;

import com.kodillla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodillla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodillla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodillla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    /**
     *   a d o p t o w a n y
     */
    Statistics statistics = new Statistics();

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistics.medianPublicationYear(books);
    }
}
