package client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import model.Book;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class RestClientLibrary implements ClientInterface {
    private final static Logger LOG = Logger.getLogger(RestClientLibrary.class);
    private static final String BASE_URL = "http://localhost:8080/RestLibraryServer/rest/library";
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public void addNewBook(Book newBook) {
        LOG.info(String.format("ADDING NEW BOOK TO LIST: %s", newBook));
        try {

            Client client = Client.create();

            WebResource webResource = client.resource(BASE_URL + "/add");

            ClientResponse response = webResource.type("application/json")
                    .post(ClientResponse.class, mapper.writeValueAsString(newBook));

            if (response.getStatus() != 200) {
                LOG.error("Failed : HTTP error code : " + response.getStatus() + "\n");
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            LOG.info("Output from Server .... \n");
            LOG.info(String.format("book has added successful: %s \n", response.getEntity(String.class)));

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    @Override
    public String getAllBooks() {
        LOG.info("GETTING ALL BOOKS\n");
        return getMethod("/getAll");
    }

    @Override
    public String getBookById(String bookId) {
        LOG.info(String.format("GETTING BOOKS BY ID: %s\n", bookId));
        return getMethod("/get/" + bookId);
    }

    @Override
    public String getBooksByAuthor(String author) {
        LOG.info("GETTING BOOKS BY AUTHOR\n");
        return getMethod("/author/" + author);
    }

    @Override
    public void changeBook(Book book) {
        LOG.info(String.format("CHANGE BOOK FROM LIST: %s", book));
        try {
            Client client = Client.create();

            WebResource webResource = client.resource(BASE_URL + "/update");

            ClientResponse response = webResource.type("application/json")
                    .put(ClientResponse.class, book);

            if (response.getStatus() != 200) {
                LOG.error("Failed : HTTP error code : " + response.getStatus() + "\n");
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            LOG.info(String.format("book was updated successful: %s \n", response.getEntity(String.class)));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(String bookId) {
        LOG.info(String.format("DELETING BOOK BY ID: %s\n", bookId));
        try {

            Client client = Client.create();

            WebResource webResource = client.resource(BASE_URL + "/delete/" + bookId);

            ClientResponse response = webResource.type("application/json")
                    .delete(ClientResponse.class);

            if (response.getStatus() != 204) {
                LOG.error("Failed : HTTP error code : " + response.getStatus() + "\n");
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            LOG.info(String.format("book with id: &s was deleted from resource\n", bookId));
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    private String getMethod(String request) {
        String output = null;
        try {
            Client client = Client.create();

            WebResource webResource = client.resource(BASE_URL + request);

            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                LOG.error("Failed : HTTP error code : " + response.getStatus() + "\n");
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            output = response.getEntity(String.class);

            LOG.info(String.format("response from server : %s \n", output));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (output != null)
            return output;
        else
            return "book list is empty";
    }

}
