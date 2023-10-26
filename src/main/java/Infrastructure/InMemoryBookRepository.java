/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Infrastructure;
import java.util.HashMap;
import java.util.Map;
import Domain.Book;
import Domain.BookRepository;
public class InMemoryBookRepository implements BookRepository {
    private Map<Integer, Book> books = new HashMap<>();
    private int nextId = 1;

    @Override
    public Book getBookById(int id) {
        return books.get(id);
    }

    @Override
    public void deleteBook(int id) {
        books.remove(id);
    }
    @Override
    public void addBook(Book book) {
    int bookId = nextId++;
    book.setId(bookId);
    books.put(bookId, book);
   }

}
