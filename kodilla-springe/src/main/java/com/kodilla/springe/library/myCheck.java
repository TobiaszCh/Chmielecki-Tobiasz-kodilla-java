package com.kodilla.springe.library;

public class myCheck {
    public static void main(String[] args) {
        LibraryDbController libraryDbController = new LibraryDbController();
        Library library = new Library(libraryDbController);
        library.loadToDb();

    }
}
