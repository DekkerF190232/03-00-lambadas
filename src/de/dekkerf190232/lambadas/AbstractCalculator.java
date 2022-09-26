package de.dekkerf190232.lambadas;

public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public abstract Numbers add(Numbers a, Numbers b);
    public abstract Numbers subtract(Numbers a, Numbers b);
    public abstract Numbers multiply(Numbers a, Numbers b);
    public abstract Numbers divide(Numbers a, Numbers b);

}
