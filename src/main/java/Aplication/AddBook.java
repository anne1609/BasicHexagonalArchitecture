/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import Domain.Book;
import Domain.BookRepository;

/**
 *
 * @author ZenBook
 */
public class AddBook {
    private final BookRepository repository;
    
    public AddBook(BookRepository repository) {
        this.repository = repository;
    }
    public void addBook(Book book) {
        repository.addBook(book);
    }
    
}
