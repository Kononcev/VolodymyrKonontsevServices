import libraryserver.Exception_Exception;
import libraryserver.LibraryServiceImpl;
import libraryserver.LibraryServiceImplService;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SoapLibraryClientTest {
    private final static Logger LOG = Logger.getLogger(SoapLibraryClientTest.class);
    private LibraryServiceImpl client;
    private String expectedResult;

    @BeforeClass
    public void setUp(){
        client =new LibraryServiceImplService().getLibraryServiceImplPort();
        expectedResult = "{\"author\":\"Doil\",\"bookNo\":\"1\",\"genre\":\"ROMANCE\",\"name\":\"Sherlock\"}{\"author\":\"Djordan\",\"bookNo\":\"2\",\"genre\":\"FANTASY\",\"name\":\"WheelOfTime\"}{\"author\":\"Brown\",\"bookNo\":\"3\",\"genre\":\"FANTASY\",\"name\":\"Inferno\"}";
    }

    @Test
    public void getAllBooksTest(){
        LOG.info("GETTING ALL BOOKS\n");
        String expectedList = expectedResult;
        String result = JsonParser.parseListToJson(client.getAllBooks());
        Assert.assertEquals(result,expectedList);
    }

    @Test
    public void addNewBookTest(){
        LOG.info("ADDING NEW BOOK:\n");
        client.addNewBook("4", "King", "COMEDY", "Jaws");
        Assert.assertTrue(!JsonParser.parseListToJson(client.getAllBooks()).equalsIgnoreCase(expectedResult));
    }

    @Test
    public void deleteBookTest(){
        LOG.info("DELETING BOOK BY ID:");
        client.deleteBook("4");
        String result = JsonParser.parseListToJson(client.getAllBooks());
        Assert.assertTrue(result.equalsIgnoreCase(expectedResult));
    }

    @Test
    public void updateBookTest(){
        LOG.info("CHANGE BOOK FROM LIST\n");
        client.updateBook("3","Doil","COMEDY", "DoilBook");
        String result = JsonParser.parseListToJson(client.getAllBooks());
        Assert.assertTrue(!result.equalsIgnoreCase(expectedResult));
    }

    @Test
    public void getBooksByAuthorTest() throws Exception_Exception {
        LOG.info("GETTING BOOKS BY AUTHOR\n");
        String result = "{\"author\":\"Doil\",\"bookNo\":\"1\",\"genre\":\"ROMANCE\",\"name\":\"Sherlock\"}{\"author\":\"Doil\",\"bookNo\":\"3\",\"genre\":\"COMEDY\",\"name\":\"DoilBook\"}";
        String books = JsonParser.parseListToJson(client.getBookByAuthor("Doil"));
        Assert.assertEquals(books,result);
    }
}
