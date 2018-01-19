package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    private String bookNo;
    private String name;
    private String author;
    private Genre genre;

    public Book() {
    }

    public Book(String bookNo, String name, String author, Genre genre) {
        this.bookNo = bookNo;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNo='" + bookNo + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }
}
