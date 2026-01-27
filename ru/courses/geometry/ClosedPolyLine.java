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
}
