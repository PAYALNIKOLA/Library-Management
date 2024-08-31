package com.kata.library.service;

import com.kata.library.model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    @Test
    public void testAddBook() {
        LibraryService libraryService = new LibraryService();
        Book book = new Book("123456789", "Effective Java", "Joshua Bloch", 2008);
        libraryService.addBook(book);

        List<Book> availableBooks = libraryService.viewAvailableBooks();
        assertTrue(availableBooks.contains(book), "Book should be added to the library");
    }

    @Test
    public void testViewAvailableBooks() {
        LibraryService libraryService = new LibraryService();
        Book book1 = new Book("123456789", "Effective Java", "Joshua Bloch", 2008);
        Book book2 = new Book("987654321", "Clean Code", "Robert C. Martin", 2008);
        libraryService.addBook(book1);
        libraryService.addBook(book2);
    
        List<Book> availableBooks = libraryService.viewAvailableBooks();
        assertEquals(2, availableBooks.size(), "There should be two available books in the library");
        assertTrue(availableBooks.contains(book1), "Effective Java should be in the available books list");
        assertTrue(availableBooks.contains(book2), "Clean Code should be in the available books list");
    }
}


