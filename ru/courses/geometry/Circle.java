public class Circle implements AreaCalculatable {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = new Point(center.getX(), center.getY());
        if (radius <= 0)
            throw new IllegalArgumentException("radius must be positive");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Окружность с центром в точке: " + center + " и радиусом: " + radius;
    }
}
