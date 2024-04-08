package ProjectCalc;

public class ClassOperation implements InterfaceOperation {

    @Override
    public IOperation createAdditionOperation() {
        return new AdditionOperation();
    }

    @Override
    public IOperation createDivisionOperation() {
        return new DivisionOperation();
    }

    @Override
    public IOperation createMultiplicationOperation() {
        return new MultiplicationOperation();
    }

    @Override
    public IOperation createSubtractionOperation() {
        return new SubtractionOperation();
    }

}
