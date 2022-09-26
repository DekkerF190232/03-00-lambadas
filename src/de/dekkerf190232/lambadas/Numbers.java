package de.dekkerf190232.lambadas;

public class Numbers {

    private double a;
    private double b;

    public Numbers(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Numbers() {
    }

    public double getA() {
        return a;
    }

    public Numbers setA(double a) {
        this.a = a;
        return this;
    }

    public double getB() {
        return b;
    }

    public Numbers setB(double b) {
        this.b = b;
        return this;
    }

    @Override
    public String toString() {
        return a + "|" + b;
    }
}
