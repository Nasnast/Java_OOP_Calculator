package ProjectCalc;

public class SubtractionOperation implements IOperation {
    public ComplexNumber operation(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }
}
