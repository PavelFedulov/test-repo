import java.util.stream.Stream;

public class Start {
    public static void main(String[] args) {
        String result = StringFromStream.getStringFromStream(Stream.of("Hello", "world!"));

        System.out.println(result);
    }
}
