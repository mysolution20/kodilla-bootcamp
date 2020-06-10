package com.kodilla.spring.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {
    private final List<String> books = new ArrayList<>();

/** wstrzykiwanie zależności bezpośrednio do pola klasy*/

    @Autowired
    private  LibraryDbController libraryDbController;

/**
   // wstrzykiwanie przez METODE tzw setera z adnotacją @Autowired  (nie rekomendowana !!!)
    @Autowired
    public void setLibraryDbController(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/

/**
    // wstrzykiwanie przez konstruktor z adnotacją @Autowired
        @Autowired
        public Library(final LibraryDbController libraryDbController) {
        this.libraryDbController = libraryDbController;
    }*/

    public Library() {
        // do nothing
    }

    public void saveToDb() {
        libraryDbController.saveData();
    }

    public void loadFromDb() {
        libraryDbController.loadData();
    }
}
