import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat(
                "Vasya",
                10,
                new ArrayList<>(Arrays.asList("Anton", "Petr", "Max"))
        );

        System.out.println(cat);
        Nullify.nullify(cat);
        System.out.println(cat);
    }
}
