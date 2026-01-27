public class GeometryUtils {
    public static double[] getLengths(Measurable[] lines) {
        double[] lengths = new double[lines.length];

        for (int i = 0; i < lines.length; i++) {
            lengths[i] = lines[i].getLength();
        }
        return lengths;
    }
}
