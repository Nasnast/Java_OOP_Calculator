package ProjectCalc;

public class DivisionOperation implements IOperation {
    public ComplexNumber operation(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
