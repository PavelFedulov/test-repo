public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p1.clone(), p2.clone());
        Line l3 = l1.clone();

        System.out.println(l1.equals(l2));
        System.out.println(l1 == l3);
        System.out.println(l1.equals(l3));
        System.out.println(l3);
    }
}
