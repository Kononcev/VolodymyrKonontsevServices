import libraryserver.LibraryServiceImpl;
import libraryserver.LibraryServiceImplService;

public class Main {
    public static void main(String[] args) {
        LibraryServiceImpl client =new LibraryServiceImplService().getLibraryServiceImplPort();
        System.out.println(JsonParser.parseListToJson(client.getAllBooks()));
    }
}
