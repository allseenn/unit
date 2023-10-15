import static org.assertj.core.api.Assertions.*;

public class Calculator {
    public static void main(String[] args) {
        // System.out.printf("Результат операции: %s \n", calculation(2, 2, '+')); // Результат операции: 4
        // System.out.printf("Результат операции: %s \n", calculation(2, 1, '-')); // Результат операции: 1
        // System.out.printf("Результат операции: %s \n", calculation(2, 0, '/')); // Результат операции: 6
        // System.out.printf("Результат операции: %s \n", calculation(8, 2, '/')); // Результат операции: 4

        // использованием утверждений:
        // assert 8 == Calculator.calculation(2, 6, '+');
        // assert 0 == Calculator.calculation(2, 2, '-');
        // assert 14 == Calculator.calculation(2, 7, '*');
        // assert 2 == Calculator.calculation(100, 0, '/');

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 0, '/')).isEqualTo(2);
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
}
