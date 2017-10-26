package libraryserver;

import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceProvider;

@WebServiceProvider
public class Exporter {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:4444/libraryservice", new LibraryServiceImpl());
    }
}
