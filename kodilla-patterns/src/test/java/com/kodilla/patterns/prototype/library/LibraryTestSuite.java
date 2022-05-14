package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("List of books on shelf number 1");
        IntStream.iterate(0,  n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n,
                        LocalDate.of(2020, 2, 11).minusYears(n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("List of books on shelf number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

      Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("List of books on shelf number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(new Book("title" + 1, "author" + 1,
                LocalDate.of(2020, 2, 11).minusYears(1)));

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        assertEquals(4, library.getBooks().size());
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());



    }
}
