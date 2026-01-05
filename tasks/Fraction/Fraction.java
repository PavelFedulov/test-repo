public class Fraction {
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
        Fraction f = new Fraction(value, 1);
        return new Fraction((this.numerator * f.denominator) + (this.denominator * f.numerator), this.denominator * f.denominator);
    }

    public Fraction minus(int value) {
        Fraction f = new Fraction(value, 1);
        return new Fraction((this.numerator * f.denominator) - (this.denominator * f.numerator), this.denominator * f.denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
