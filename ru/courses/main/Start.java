public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        Point p3 = p1.clone();

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1 == p3);       // false
        System.out.println(p1.equals(p3));  // true
        System.out.println(p3);
    }
}
