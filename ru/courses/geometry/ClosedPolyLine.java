public class ClosedPolyLine extends PolyLine{

    public ClosedPolyLine() {
        super();
    }

    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    @Override
    public double getLength() {
        if(points.length < 2) {
            return 0;
        }
        Line closingLine = new Line(points[points.length - 1], points[0]);
        return super.getLength() + closingLine.getLength();
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
        sb.append(",");
        sb.append(points[0]);
        sb.append("]");
        return sb.toString();
    }
}
