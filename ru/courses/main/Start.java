import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(3,5);

        double res = MathUtils.sumAll(2, fr1, 2.3);
        System.out.println(res);
    }
}
