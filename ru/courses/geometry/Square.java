public class Square {
    Point point;
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        checkSideLengthPositive(sideLength);
        this.point = new Point(x,y);
        this.sideLength = sideLength;
    }

    private static void checkSideLengthPositive(int sideLength) {
        if (sideLength <= 0)
            throw new IllegalArgumentException("side length must be positive");
    }

    public void setState(int x, int y, int sideLength) {
        checkSideLengthPositive(sideLength);
        this.point = new Point(x,y);
        this.sideLength = sideLength;
    }

    public void setPoint(int x, int y) {
        this.point = new Point(x,y);
    }

    public void setSideLength(int sideLength) {
        checkSideLengthPositive(sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Квадрат в точке " + point + " со стороной " + sideLength;
    }
}

