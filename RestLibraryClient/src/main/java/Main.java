import client.ClientInterface;
import client.RestClientLibrary;
import model.Book;
import model.Genre;

public class Main {
    private ClientInterface client = new RestClientLibrary();
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Book book = new Book("4","War","Vova",  Genre.HORROR);
        main.client.addNewBook(book);
        //main.client.addNewBook("Vova", "2", "COMEDY", "book");
        //main.client.deleteBook("2");
        //main.client.getBooksByAuthor("Vova");
        System.out.println(main.client.getAllBooks());
    }
}
