class MultiplicationFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Multiplication();
    }
}
