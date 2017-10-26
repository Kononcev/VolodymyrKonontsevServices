package libraryserver;


import model.Book;

import java.util.List;

public interface LibraryService {
    Book getBook(String bookNo);

    List<Book> getBooks();

    String addNewBook(String bookNo, String bookAuthor, String bookGenre, String bookName);

    String updateBook(String bookNo, String bookAuthor, String bookGenre, String bookName);

    List<Book> getBookByAuthor(String author) throws Exception;

    void deleteBook(String bookNo);
}
