public class Start {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(5,8);
        Point point3 = new Point(10,11);
        Point point4 = new Point(15, 19);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(line1.pointEnd, line2.pointStart);

        System.out.println(line3);

        line3.pointStart.x = 7;
        line3.pointStart.y = 9;

        line3.pointEnd.x = 12;
        line3.pointEnd.y = 14;

        System.out.println(line3);

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();

        System.out.println(totalLength);
    }
}
