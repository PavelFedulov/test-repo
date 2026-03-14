import java.util.ArrayList;

public class Booble {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n = 6;

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i += 2) {
                int previous = numbers.get(i);
                numbers.set(i, numbers.get(i + 1));
                numbers.set(i + 1, previous);
        }

        System.out.println(numbers);
    }
}
