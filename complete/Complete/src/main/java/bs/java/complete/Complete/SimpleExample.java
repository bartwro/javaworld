package bs.java.complete.Complete;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SimpleExample {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        gson.toJson("Hello", System.out);
        gson.toJson(123, System.out);
    }
}