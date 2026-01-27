public class Start {
    public static void main(String[] args) {
        Point point1 = new Point(1,5);
        Point point2 = new Point(2,8);
        Point point3 = new Point(5,3);
        Point point4 = new Point(8, 9);

        Point[] points = {point1, point2, point3, point4};
        PolyLine polyLine = new PolyLine(points);

        double polyLength = polyLine.getLength();
        System.out.println("Длина Ломаной: " + polyLength);

        Line[] lines = polyLine.getLines();

        double linesLength = 0;
        for (Line line : lines) {
            linesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + linesLength);

        System.out.println("Длина ломаной и длина массива линий совпадают: " + (polyLength == linesLength));

        System.out.println("Координаты ломаной линии: " + polyLine);

        point2.x = 12;
        point2.y = 8;

        System.out.println("Координаты измененной ломаной линии: " + polyLine);

        for (Line line : lines) {
            System.out.println(line);
        }
    }
}
