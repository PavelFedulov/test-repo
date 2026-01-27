public class Line {
    private final Point pointStart;
    private final Point pointEnd;

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.pointStart = new Point(x1, y1);
        this.pointEnd = new Point(x2, y2);
    }

    public double getLength() {
        int dx = pointEnd.getX() - pointStart.getX();
        int dy = pointEnd.getY() - pointStart.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Линия от " + pointStart + " до " + pointEnd;
    }
}
