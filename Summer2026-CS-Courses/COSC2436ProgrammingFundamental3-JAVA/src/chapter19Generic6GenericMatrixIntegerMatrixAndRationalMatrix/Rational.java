package chapter19Generic6GenericMatrixIntegerMatrixAndRationalMatrix;

public class Rational extends Number {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational add(Rational r) {
        return new Rational(
            numerator * r.denominator + denominator * r.numerator,
            denominator * r.denominator
        );
    }

    public Rational multiply(Rational r) {
        return new Rational(
            numerator * r.numerator,
            denominator * r.denominator
        );
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) numerator / denominator;
    }

    @Override
    public double doubleValue() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
