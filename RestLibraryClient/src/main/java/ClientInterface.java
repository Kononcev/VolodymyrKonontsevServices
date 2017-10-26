import java.io.BufferedReader;

public interface ClientInterface {
    String getAllBooks();
    String getBookById(String bookId);
    String getBooksByAuthor(String author);
    void addNewBook(String newBook);
    void changeBook(String book);
    void deleteBook(String bookId);
}
