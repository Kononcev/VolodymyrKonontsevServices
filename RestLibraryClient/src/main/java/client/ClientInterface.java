package client;

import model.Book;

public interface ClientInterface {
    String getAllBooks();
    String getBookById(String bookId);
    String getBooksByAuthor(String author);
    void addNewBook(Book newBook);
    void changeBook(Book book);
    void deleteBook(String bookId);
}
