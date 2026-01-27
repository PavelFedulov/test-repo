public class Fraction extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator <= 0)
            throw new IllegalArgumentException("denominator must be positive");
        this.denominator = denominator;
    }

    public Fraction sum(Fraction f) {
        return new Fraction((this.numerator * f.denominator) + (this.denominator * f.numerator), this.denominator * f.denominator);
    }

    public Fraction minus(Fraction f) {
        return new Fraction((this.numerator * f.denominator) - (this.denominator * f.numerator), this.denominator * f.denominator);
    }

    public Fraction sum(int value) {
        return sum(new Fraction(value, 1));
    }

    public Fraction minus(int value) {
        return minus(new Fraction(value, 1));
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return (long) numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }
}
