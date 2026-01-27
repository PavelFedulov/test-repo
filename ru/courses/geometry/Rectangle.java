public class Rectangle implements AreaCalculatable {
    private final Point point;
    private final double sideLengthLong;
    private final double sideLengthShort;

    public Rectangle(Point point, double sideLengthLong, double sideLengthShort){
        if (sideLengthLong <= 0 || sideLengthShort <= 0)
            throw new IllegalArgumentException("both sideLengths must be positive");
        this.point = new Point(point.getX(), point.getY());
        this.sideLengthLong = sideLengthLong;
        this.sideLengthShort = sideLengthShort;
    }

    @Override
    public double getArea() {
        return sideLengthLong * sideLengthShort;
    }

    @Override
    public String toString() {
        return "Прямоугольник в точке " + point + " со сторонами " + sideLengthLong + " и " + sideLengthShort;
    }
}
