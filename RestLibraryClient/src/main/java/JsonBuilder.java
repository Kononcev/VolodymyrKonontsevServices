import org.json.simple.JSONObject;

public class JsonBuilder {
    private static JSONObject object = new JSONObject();

    public static String buildBook(String author, String bookNo, String genre, String bookName){
        object.put("author",author);
        object.put("bookNo", bookNo);
        object.put("genre", genre);
        object.put("name", bookName);
        return object.toJSONString();
    }
}
