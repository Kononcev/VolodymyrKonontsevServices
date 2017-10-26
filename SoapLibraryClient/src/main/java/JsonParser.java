import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public static String parseObjToJson(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        String objInString =null;
        try {
            objInString = mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return objInString;
    }

    public static String parseListToJson(List objects){
        StringBuilder book = new StringBuilder();
        final ObjectMapper mapper = new ObjectMapper();
            objects.stream().forEach(el -> {
                try {
                    book.append(mapper.writeValueAsString(el));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            });
        return book.toString();
    }
}
