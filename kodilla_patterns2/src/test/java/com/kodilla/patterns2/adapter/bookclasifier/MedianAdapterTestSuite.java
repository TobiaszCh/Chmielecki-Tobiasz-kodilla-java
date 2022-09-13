package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Adam", "Tree", 1999, "74665");
        Book book2 = new Book("Kornel", "Girl", 1994, "75695");
        Book book3 = new Book("Basia", "Head", 1988, "74225");
        Book book4 = new Book("Grzesiu", "Morder", 2000, "12365");
        Book book5 = new Book("Andrzej", "Wins", 2001, "74987");

        Set<Book> book = new HashSet<>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int result = medianAdapter.publicationYearMedian(book);

        //Then
        assertEquals(result, 1999);

    }
}
