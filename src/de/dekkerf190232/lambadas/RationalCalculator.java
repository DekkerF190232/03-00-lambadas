package de.dekkerf190232.lambadas;

public class RationalCalculator extends AbstractCalculator {

    public RationalCalculator() {
        super((r1, r2) -> {
                    double a = r1.getA() * r2.getB() + r2.getA() * r1.getB();
                    double b = r1.getB() * r2.getB();
                    double m = gcd((int) a, (int) b);
                    return new Numbers(a / m, b / m);
                },
                (r1, r2) -> {
                    double a = r1.getA() * r2.getB() - r2.getA() * r1.getB();
                    double b = r1.getB() * r2.getB();
                    double m = gcd((int) a, (int) b);
                    return new Numbers(a / m, b / m);
                },
                (r1, r2) -> {
                    double a = r1.getA() * r2.getA();
                    double b = r1.getB() * r2.getB();
                    double m = gcd((int) a, (int) b);
                    return new Numbers(a / m, b / m);
                },
                (r1, r2) -> {
                    double a = r1.getA() * r2.getB();
                    double b = r1.getB() * r2.getA();
                    double m = gcd((int) a, (int) b);
                    return new Numbers(a / m, b / m);
                });
    }

    private static int gcd(int n1, int n2) {
        if (n2 == 0) return n1;
        return gcd(n2, n1 % n2);
    }

    @Override
    public Numbers add(Numbers a, Numbers b) {
        return add.calc(a, b);
    }

    @Override
    public Numbers subtract(Numbers a, Numbers b) {
        return subtract.calc(a, b);
    }

    @Override
    public Numbers multiply(Numbers a, Numbers b) {
        return multiply.calc(a, b);
    }

    @Override
    public Numbers divide(Numbers a, Numbers b) {
        return divide.calc(a, b);
    }

}
