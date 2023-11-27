import java.math.BigDecimal;
import java.util.logging.Logger;

public class Calculator {
    private final Operation operation;
    private final Logger logger;

    public Calculator(OperationFactory operationFactory, Logger logger) {
        this.operation = operationFactory.createOperation();
        this.logger = logger;
    }

    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2, String operationName) {
        BigDecimal result = operation.perform(operand1, operand2);
        logOperation(operand1, operand2, result, operationName);
        return result;
    }

    private void logOperation(BigDecimal operand1, BigDecimal operand2, BigDecimal result, String operationName) {
        String logMessage = "Operation: " + operationName + ", Operand 1: " + operand1 + ", Operand 2: " + operand2 + ", Result: " + result;
        logger.info(logMessage);
        System.out.println(logMessage);
    }
}

