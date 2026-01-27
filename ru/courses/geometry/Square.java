public class Square implements AreaCalculatable {
    private final Point point;
    private final double sideLength;

    public Square(Point point, double sideLength) {
        if (sideLength <= 0)
            throw new IllegalArgumentException("side length must be positive");
        this.point = new Point(point.getX(), point.getY());
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}

