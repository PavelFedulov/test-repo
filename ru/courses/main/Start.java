import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point(1,3), 10);
        Circle circle2 = new Circle(new Point(4,7), 12);
        Square square1 = new Square(new Point(1,1), 3);
        Square square2 = new Square(new Point(3,3), 4);
        Rectangle rectangle1 = new Rectangle(new Point(4,7), 10,4);
        Rectangle rectangle2 = new Rectangle(new Point(7,9), 12,7);

        double totalArea = GeometryUtils.sumAllAreas(circle1,circle2,square1,square2,rectangle1,rectangle2);

        System.out.println(totalArea);
    }
}
