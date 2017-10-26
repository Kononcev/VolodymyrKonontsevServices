package libraryserver;


import dao.BookDAO;
import model.Book;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public class LibraryServiceImpl implements LibraryService {

    @WebMethod(operationName = "findBookById")
    public Book getBook(@WebParam(partName = "book id") String bookNo) {
        return BookDAO.getBook(bookNo);
    }

    @WebMethod(operationName = "getAllBooks")
    public List<Book> getBooks() {
        return BookDAO.getAllBooks();
    }

    @WebMethod(operationName = "addNewBook")
    public String addNewBook(@WebParam(partName = "bookNo")String bookNo, @WebParam(partName = "bookAuthor")String author, @WebParam(partName = "bookGenre")String genre, @WebParam(partName = "bookName")String bookName) {
        Book book = new Book(bookNo, bookName, author, genre);
        BookDAO.addBook(book);
        return book.toString();
    }

    @WebMethod(operationName = "updateBook")
    public String updateBook(@WebParam(partName = "bookNo")String bookNo, @WebParam(partName = "bookAuthor")String author, @WebParam(partName = "bookGenre")String genre, @WebParam(partName = "bookName")String bookName){
        Book book = new Book(bookNo, bookName, author, genre);
        BookDAO.updateBook(book);
        return book.toString();
    }

    @WebMethod
    public List<Book> getBookByAuthor(@WebParam(partName = "bookAuthor") String author) throws Exception {
        return BookDAO.getBookByAuthor(author);
    }

    @WebMethod
    public void deleteBook(@WebParam(partName = "bookNo") String bookNo) {
        BookDAO.deleteBook(bookNo);
    }
}

