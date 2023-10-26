
package Aplication;

import Domain.BookRepository;
import Domain.Book;

/**
 *
 * @author ZenBook
 */
public class BookUseCase {
    private final BookRepository repository;

    public BookUseCase(BookRepository repository) {
        this.repository = repository;
    }

    public Book getBook(int id) {
        return repository.getBookById(id);
    }

    public void deleteBook(int id) {
        repository.deleteBook(id);
    }
}
