package pt.uma.tspi.arqd;

import java.util.Objects;

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
        numerator= 0;
        denominator = 0;
    }

    @Override
    public boolean equals(Object obj) {
        Rational other = (Rational) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    @Override
    public int compareTo(Rational o) {
        int numerator = this.numerator - o.numerator;
        int denominator = this.denominator - o.denominator;
        return numerator + denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator,denominator);
    }

    @Override
    public String toString() {
        return  "Numerator: " + numerator + " Denominator: " + denominator;
    }
}
