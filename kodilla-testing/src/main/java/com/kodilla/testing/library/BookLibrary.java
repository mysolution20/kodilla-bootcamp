package com.kodilla.testing.library;


import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    // 1. temporary returning list of one book
/*
   public List<Book> listBooksWithCondition_temp(String titleFragment){

    List<Book> bookList = new ArrayList<>();
    Book book = new Book("The book title","The book author", 2000);
    bookList.add(book);

    return bookList;
   }*/

    // 2.   Implementacja metody

    public List<Book> listBooksWithCondition(String titleFragment) {


        List<Book> bookList = new ArrayList<Book>();

        if (titleFragment.length() < 3) return bookList;

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 20) return bookList;
        bookList = resultList;

        return bookList;

    }


    // 1. temporary returning list of one LibraryUser

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        return libraryDatabase.listBooksInHandsOf(libraryUser);

    }


}
