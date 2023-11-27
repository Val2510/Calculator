import java.math.BigDecimal;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Main.class.getName());

        OperationFactory sumFactory = new SumFactory();
        OperationFactory multiplicationFactory = new MultiplicationFactory();
        OperationFactory divisionFactory = new DivisionFactory();

        Calculator sumCalculator = new Calculator(sumFactory, logger);
        Calculator multiplicationCalculator = new Calculator(multiplicationFactory, logger);
        Calculator divisionCalculator = new Calculator(divisionFactory, logger);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        BigDecimal operand1 = scanner.nextBigDecimal();
        System.out.print("Введите второе число: ");
        BigDecimal operand2 = scanner.nextBigDecimal();

        BigDecimal sumResult = sumCalculator.calculate(operand1, operand2, "Sum");
        BigDecimal multiplicationResult = multiplicationCalculator.calculate(operand1, operand2, "Multiplication");
        BigDecimal divisionResult = divisionCalculator.calculate(operand1, operand2, "Division");

        System.out.println("Результат сложения = " + sumResult);
        System.out.println("Результат умножения = " + multiplicationResult);
        System.out.println("Результат деления = " + divisionResult);
    }
}
