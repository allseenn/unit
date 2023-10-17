public class Calculator {

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double total = purchaseAmount - purchaseAmount * discountAmount / 100;
        if (total < 0) throw new ArithmeticException("Ошибка: Отрицательная сумма покупки не может быть");
        if (discountAmount < 0) throw new ArithmeticException("Ошибка: Процент не может быть отрицательным");
        if (purchaseAmount <= 0) throw new ArithmeticException("Ошибка: Цена должна быть больше нуля");
        return total; // Метод должен возвращать сумму покупки со скидкой
        
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

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

}