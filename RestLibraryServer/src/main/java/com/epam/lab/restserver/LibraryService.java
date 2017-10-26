package com.epam.lab.restserver;


import dao.BookDAO;
import model.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/library")
public class LibraryService {
    // URI:
    // // /RestLibraryServer/rest/getAll
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBook() {
        return BookDAO.getAllBooks();
    }

    // URI:
    // /RestLibraryServer/rest/get
    @GET
    @Path("/get/{bookNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(@PathParam("bookNo") String bookNo) {
        return BookDAO.getBook(bookNo);
    }

    // URI:
    // /RestLibraryServer/rest/add
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book addBook(Book book) {
        return BookDAO.addBook(book);
    }

    @GET
    @Path("/author/{author}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooksByAuthor(@PathParam("author") String author) throws Exception {
        return BookDAO.getBookByAuthor(author);
    }

    // URI:
    // /RestLibraryServer/rest/update
    @PUT
    @Path("/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Book updateBook(Book book) {
        return BookDAO.updateBook(book);
    }

    // /RestLibraryServer/rest/delete/[bookNo]
    @DELETE
    @Path("/delete/{bookNo}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteBook(@PathParam("bookNo") String bookNo) {
        BookDAO.deleteBook(bookNo);
    }

}
