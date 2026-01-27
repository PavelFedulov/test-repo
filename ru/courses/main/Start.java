import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Point point1 = new Point(1,3);
        Point point2 = new Point(2,2);
        Point point3 = new Point(3,4);
        Point point4 = new Point(5,5);
        Point point5 = new Point(7,7);

        Point[] points = {point1,point2,point3,point4,point5};

        PolyLine closed = new ClosedPolyLine(points);
        PolyLine polyLine = new PolyLine(points);

        Measurable[] lines = {closed, polyLine};

        double[] result = GeometryUtils.getLengths(lines);

        System.out.println(Arrays.toString(result));

        System.out.println(polyLine.getLength());
        System.out.println(closed.getLength());
    }
}
