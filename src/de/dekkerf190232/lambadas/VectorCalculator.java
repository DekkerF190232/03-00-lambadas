package de.dekkerf190232.lambadas;

public class VectorCalculator extends AbstractCalculator {

    public VectorCalculator() {
        super((v1, v2) -> new Numbers(v1.getA() + v2.getA(), v1.getB() + v2.getB() ),
                (v1, v2) -> new Numbers(v1.getA() - v2.getA(), v1.getB() - v2.getB() ),
                (v1, v2) -> new Numbers(v1.getA() * v2.getA(), v1.getB() * v2.getB() ),
                (v1, v2) -> new Numbers(v1.getA() / v2.getA(), v1.getB() / v2.getB() ));
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
