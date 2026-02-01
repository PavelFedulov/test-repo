import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Exponentiation {
    public static double exponentiation(String x, String y) {
        int base = parseInt(x);
        int exponent = parseInt(y);
        return pow(base, exponent);
    }
}
