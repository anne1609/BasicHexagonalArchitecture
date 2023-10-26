package Sections;

import Domain.Book;
import Domain.BookRepository;
import Infrastructure.InMemoryBookRepository;
import Aplication.AddBook;
import Aplication.DeleteBook;
import Aplication.GetBook;

public class BookApp {
    public static void main(String[] args) {
        BookRepository repository = new InMemoryBookRepository();

        // Caso de uso para agregar un libro
        AddBook addBook = new AddBook(repository);

        // Caso de uso para eliminar un libro
        DeleteBook deleteBook = new DeleteBook(repository);

        // Caso de uso para obtener un libro
        GetBook getBook = new GetBook(repository);

        Book book = new Book(1, "El Gran Gatsby", "F. Scott Fitzgerald");

        // Agregar un libro
        addBook.addBook(book);

        // Obtener un libro
        Book retrievedBook = getBook.getBook(1);
        if (retrievedBook != null) {
            System.out.println("Título: " + retrievedBook.getTitle());
            System.out.println("Autor: " + retrievedBook.getAuthor());
        } else {
            System.out.println("El libro no existe.");
        }

        // Eliminar un libro
        deleteBook.deleteBook(1);
        System.out.println("Libro eliminado.");
    }
}
