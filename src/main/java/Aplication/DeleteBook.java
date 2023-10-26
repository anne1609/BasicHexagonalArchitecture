/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplication;

import Domain.BookRepository;


/**
 *
 * @author ZenBook
 */
public class DeleteBook {
    private final BookRepository repository;
    
    public DeleteBook(BookRepository repository) {
        this.repository = repository;
    }
    public void deleteBook(int id) {
        repository.deleteBook(id);
    }

}
