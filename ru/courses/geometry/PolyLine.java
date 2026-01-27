public class PolyLine implements Measurable {
    public Point[] points;

    public PolyLine() {
        this.points = new Point[0];
    }

    public PolyLine(Point[] points) {
        this.points = points;
    }

    public Line[] getLines() {
        if (points.length < 2) {
            return new Line[0];
        }

        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    public double getLength() {
        double sum = 0;
        for (Line line : getLines()) {
            sum += line.getLength();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия [");
        for (int i = 0; i < points.length; i++) {
            sb.append(points[i]);
            if (i < points.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
