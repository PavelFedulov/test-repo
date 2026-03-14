import java.util.ArrayList;

public class TaskForEach {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(element -> System.out.println(element));
    }
}
