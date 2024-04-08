package ProjectCalc;

public class Calculate {
    private IOperation operation;

    public Calculate(IOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return operation.operation(a, b);
    }

}