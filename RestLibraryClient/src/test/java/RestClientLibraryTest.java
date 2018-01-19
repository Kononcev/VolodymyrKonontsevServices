import client.ClientInterface;
import client.RestClientLibrary;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class RestClientLibraryTest {
    private ClientInterface client;
    private String expectedResult;

    @BeforeClass
    public void setUp(){
        client = new RestClientLibrary();
        expectedResult = "[{\"author\":\"Doil\",\"bookNo\":\"1\",\"genre\":\"ROMANCE\",\"name\":\"Sherlock\"},{\"author\":\"Djordan\",\"bookNo\":\"2\",\"genre\":\"FANTASY\",\"name\":\"WheelOfTime\"},{\"author\":\"Brown\",\"bookNo\":\"3\",\"genre\":\"FANTASY\",\"name\":\"Inferno\"}]";
    }

    @Test
    public void getAllBooksTest(){
        String expectedList = expectedResult;
        String result = client.getAllBooks();
        Assert.assertEquals(result,expectedList);
    }

    /*@Test
    public void addNewBookTest(){
        String newBook = JsonBuilder.buildBook("King", "4", "COMEDY", "Jaws");
        client.addNewBook(newBook);
        Assert.assertTrue(!client.getAllBooks().equalsIgnoreCase(expectedResult));
    }*/

    @Test
    public void deleteBookTest(){
        client.deleteBook("4");
        Assert.assertTrue(client.getAllBooks().equalsIgnoreCase(expectedResult));
    }

    /*@Test
    public void updateBookTest(){
       String newBook = JsonBuilder.buildBook("Doil","3","COMEDY", "DoilBook");
       client.changeBook(newBook);
       Assert.assertTrue(!client.getAllBooks().equalsIgnoreCase(expectedResult));
    }*/

    @Test
    public void getBooksByAuthorTest(){
        String result = "[{\"author\":\"Doil\",\"bookNo\":\"1\",\"genre\":\"ROMANCE\",\"name\":\"Sherlock\"},{\"author\":\"Doil\",\"bookNo\":\"3\",\"genre\":\"COMEDY\",\"name\":\"DoilBook\"}]";
        String books = client.getBooksByAuthor("Doil");
        Assert.assertEquals(books,result);
    }
}
