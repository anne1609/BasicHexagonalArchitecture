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
public class GetBook {
    private final BookRepository repository;
    
    public GetBook(BookRepository repository) {
        this.repository = repository;
    }
    public Book getBook(int id) {
        return repository.getBookById(id);
    }
}

    

