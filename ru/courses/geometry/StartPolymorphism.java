public class StartPolymorphism {
    public static void main(String[] args) {
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8, 9);

        Point[] points = {point1, point2, point3, point4};
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(points);

        double closedPolyLineLength = closedPolyLine.getLength();
        System.out.println("Длина замкнутой ломаной: " + closedPolyLineLength);
    }
}
