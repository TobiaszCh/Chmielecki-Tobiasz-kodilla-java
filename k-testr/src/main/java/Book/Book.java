package Book;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

/* Class Employee represents an employee in the company */
public class Book {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;

    // Constructor
    public Book(String firstName, String lastName, int yearOfBirth,
                    int monthOfBirth, int dayOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Class LocalDate provided by java.time library is used
        // to store dates. Constructor of(int year, int month, int day) could be
        // used to initialize LocalDate variable value
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
    }


    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(firstName, book.firstName) && Objects.equals(lastName, book.lastName) && Objects.equals(birthDate, book.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }
}
