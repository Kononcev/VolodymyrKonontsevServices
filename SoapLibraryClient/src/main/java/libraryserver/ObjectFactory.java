
package libraryserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the libraryserver package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddNewBookResponse_QNAME = new QName("http://libraryserver/", "addNewBookResponse");
    private final static QName _DeleteBook_QNAME = new QName("http://libraryserver/", "deleteBook");
    private final static QName _GetAllBooks_QNAME = new QName("http://libraryserver/", "getAllBooks");
    private final static QName _DeleteBookResponse_QNAME = new QName("http://libraryserver/", "deleteBookResponse");
    private final static QName _UpdateBookResponse_QNAME = new QName("http://libraryserver/", "updateBookResponse");
    private final static QName _AddNewBook_QNAME = new QName("http://libraryserver/", "addNewBook");
    private final static QName _GetAllBooksResponse_QNAME = new QName("http://libraryserver/", "getAllBooksResponse");
    private final static QName _FindBookById_QNAME = new QName("http://libraryserver/", "findBookById");
    private final static QName _GetBookByAuthor_QNAME = new QName("http://libraryserver/", "getBookByAuthor");
    private final static QName _FindBookByIdResponse_QNAME = new QName("http://libraryserver/", "findBookByIdResponse");
    private final static QName _UpdateBook_QNAME = new QName("http://libraryserver/", "updateBook");
    private final static QName _GetBookByAuthorResponse_QNAME = new QName("http://libraryserver/", "getBookByAuthorResponse");
    private final static QName _Exception_QNAME = new QName("http://libraryserver/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: libraryserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookByAuthor }
     * 
     */
    public GetBookByAuthor createGetBookByAuthor() {
        return new GetBookByAuthor();
    }

    /**
     * Create an instance of {@link FindBookByIdResponse }
     * 
     */
    public FindBookByIdResponse createFindBookByIdResponse() {
        return new FindBookByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateBook }
     * 
     */
    public UpdateBook createUpdateBook() {
        return new UpdateBook();
    }

    /**
     * Create an instance of {@link GetBookByAuthorResponse }
     * 
     */
    public GetBookByAuthorResponse createGetBookByAuthorResponse() {
        return new GetBookByAuthorResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddNewBookResponse }
     * 
     */
    public AddNewBookResponse createAddNewBookResponse() {
        return new AddNewBookResponse();
    }

    /**
     * Create an instance of {@link DeleteBook }
     * 
     */
    public DeleteBook createDeleteBook() {
        return new DeleteBook();
    }

    /**
     * Create an instance of {@link GetAllBooks }
     * 
     */
    public GetAllBooks createGetAllBooks() {
        return new GetAllBooks();
    }

    /**
     * Create an instance of {@link DeleteBookResponse }
     * 
     */
    public DeleteBookResponse createDeleteBookResponse() {
        return new DeleteBookResponse();
    }

    /**
     * Create an instance of {@link UpdateBookResponse }
     * 
     */
    public UpdateBookResponse createUpdateBookResponse() {
        return new UpdateBookResponse();
    }

    /**
     * Create an instance of {@link AddNewBook }
     * 
     */
    public AddNewBook createAddNewBook() {
        return new AddNewBook();
    }

    /**
     * Create an instance of {@link GetAllBooksResponse }
     * 
     */
    public GetAllBooksResponse createGetAllBooksResponse() {
        return new GetAllBooksResponse();
    }

    /**
     * Create an instance of {@link FindBookById }
     * 
     */
    public FindBookById createFindBookById() {
        return new FindBookById();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "addNewBookResponse")
    public JAXBElement<AddNewBookResponse> createAddNewBookResponse(AddNewBookResponse value) {
        return new JAXBElement<AddNewBookResponse>(_AddNewBookResponse_QNAME, AddNewBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "deleteBook")
    public JAXBElement<DeleteBook> createDeleteBook(DeleteBook value) {
        return new JAXBElement<DeleteBook>(_DeleteBook_QNAME, DeleteBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "getAllBooks")
    public JAXBElement<GetAllBooks> createGetAllBooks(GetAllBooks value) {
        return new JAXBElement<GetAllBooks>(_GetAllBooks_QNAME, GetAllBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "deleteBookResponse")
    public JAXBElement<DeleteBookResponse> createDeleteBookResponse(DeleteBookResponse value) {
        return new JAXBElement<DeleteBookResponse>(_DeleteBookResponse_QNAME, DeleteBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "updateBookResponse")
    public JAXBElement<UpdateBookResponse> createUpdateBookResponse(UpdateBookResponse value) {
        return new JAXBElement<UpdateBookResponse>(_UpdateBookResponse_QNAME, UpdateBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "addNewBook")
    public JAXBElement<AddNewBook> createAddNewBook(AddNewBook value) {
        return new JAXBElement<AddNewBook>(_AddNewBook_QNAME, AddNewBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "getAllBooksResponse")
    public JAXBElement<GetAllBooksResponse> createGetAllBooksResponse(GetAllBooksResponse value) {
        return new JAXBElement<GetAllBooksResponse>(_GetAllBooksResponse_QNAME, GetAllBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "findBookById")
    public JAXBElement<FindBookById> createFindBookById(FindBookById value) {
        return new JAXBElement<FindBookById>(_FindBookById_QNAME, FindBookById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "getBookByAuthor")
    public JAXBElement<GetBookByAuthor> createGetBookByAuthor(GetBookByAuthor value) {
        return new JAXBElement<GetBookByAuthor>(_GetBookByAuthor_QNAME, GetBookByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "findBookByIdResponse")
    public JAXBElement<FindBookByIdResponse> createFindBookByIdResponse(FindBookByIdResponse value) {
        return new JAXBElement<FindBookByIdResponse>(_FindBookByIdResponse_QNAME, FindBookByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "updateBook")
    public JAXBElement<UpdateBook> createUpdateBook(UpdateBook value) {
        return new JAXBElement<UpdateBook>(_UpdateBook_QNAME, UpdateBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "getBookByAuthorResponse")
    public JAXBElement<GetBookByAuthorResponse> createGetBookByAuthorResponse(GetBookByAuthorResponse value) {
        return new JAXBElement<GetBookByAuthorResponse>(_GetBookByAuthorResponse_QNAME, GetBookByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://libraryserver/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
