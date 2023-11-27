class DivisionFactory implements OperationFactory {
    @Override
    public Division createOperation() {
        return new Division();
    }
}
