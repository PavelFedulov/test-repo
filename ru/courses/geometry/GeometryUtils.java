public class GeometryUtils {
    public static double[] getLengths(Measurable[] lines) {
        double[] lengths = new double[lines.length];

        for (int i = 0; i < lines.length; i++) {
            lengths[i] = lines[i].getLength();
        }
        return lengths;
    }

    public static double sumAllAreas(AreaCalculatable... figures) {
         double sum = 0.0;

        for (AreaCalculatable n : figures) {
            sum += n.getArea();
        }
        return sum;
    }
}
