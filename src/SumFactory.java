public class SumFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Add();
    }
}
