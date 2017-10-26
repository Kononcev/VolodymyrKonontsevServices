package dao;

import model.Book;

import java.util.*;

public class BookDAO {
    private static final Map<String, Book> bookList = new HashMap<>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Book book1 = new Book("1","Sherlock", "Doil", "ROMANCE");
        Book book2 = new Book("2","WheelOfTime", "Djordan", "FANTASY");
        Book book3 = new Book("3","Inferno", "Brown", "FANTASY");

        bookList.put(book1.getBookNo(),book1);
        bookList.put(book2.getBookNo(),book2);
        bookList.put(book3.getBookNo(),book3);
    }

    public static Book getBook(String bookNo) {
        return bookList.get(bookNo);
    }

    public static Book addBook(Book book) {
        bookList.put(book.getBookNo(), book);
        return book;
    }

    public static List<Book> getBookByAuthor(String author) throws Exception {
        List<Book> books = new ArrayList<>();
        for(Book book: bookList.values())
        {
            if(book.getAuthor().equalsIgnoreCase(author))
                books.add(book);
        }
        if(books.size()!=0)
            return books;
        else
            throw new Exception();
    }

    public static Book updateBook(Book book) {
        bookList.put(book.getBookNo(), book);
        return book;
    }

    public static void deleteBook(String bookNo) {
        for(Book book: bookList.values())
        {
            if(book.getBookNo().equals(bookNo))
                bookList.remove(bookNo);
        }
    }

    public static List<Book> getAllBooks() {
        Collection<Book> c = bookList.values();
        List<Book> list = new ArrayList<>();
        list.addAll(c);
        return list;
    }
}
