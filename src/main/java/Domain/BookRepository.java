
package Domain;

import Domain.Book;


public interface BookRepository {
    
    Book getBookById(int id);
    void deleteBook(int id);
    void addBook(Book book);

   
}
