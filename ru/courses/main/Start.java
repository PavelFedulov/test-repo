public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Point p3 = new Point(2,2);

        Point[] points = {p1, p2, p3};

        PolyLine line1 = new PolyLine(points);
        PolyLine line2 = new PolyLine(points);

        System.out.println(line2.equals(line2));
        System.out.println(line1 == line2);
        System.out.println(line1.getLength());
    }
}
