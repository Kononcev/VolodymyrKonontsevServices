import org.json.simple.JSONObject;

public class Main {
    private ClientInterface client = new RestClientLibrary();
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        //main.client.addNewBook("Vova", "2", "COMEDY", "book");
        //main.client.deleteBook("2");
        //main.client.getBooksByAuthor("Vova");
        //System.out.println(main.client.getAllBooks());
        JSONObject obj = new JSONObject();
        obj.put("author","Vova");
        obj.put("bookNo", "3");
        obj.put("genre", "FANTASY");
        obj.put("name", "bokkName");
        System.out.println(obj.toJSONString());
    }
}
