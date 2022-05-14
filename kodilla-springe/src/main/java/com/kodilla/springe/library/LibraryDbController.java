package com.kodilla.springe.library;

import org.springframework.stereotype.Repository;

@Repository
public class LibraryDbController {

    public void saveData() {
        System.out.println("Saving data to the database.");
    }

    public void loadDate() {
        System.out.println("Loading data to the database.");
    }
}
