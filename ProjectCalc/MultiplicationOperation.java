package ProjectCalc;

public class MultiplicationOperation implements IOperation {
    public ComplexNumber operation(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * a.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + b.getReal() * a.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
