package hw.first.Calculator;

import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    public static void main(String[] args) {

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() ->
//                Calculator.calculation(8, 4, '_')
//        ).isInstanceOf(IllegalStateException.class);

        System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
        System.out.println(Calculator.squareRootExtraction(4));

        // Примерные решения домашних заданий из 1 лекции:

        // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
        // необходимые проверки для него используя граничные случаи
        assertThatThrownBy(() ->
                Calculator.squareRootExtraction(-2))
                .isInstanceOf(IllegalArgumentException.class);

        // HW1.2: Как будет выглядеть проверка для случая деления на ноль? (с использованием AssertJ)
        assertThatThrownBy(() ->
                hw.first.Calculator.Calculator.calculation(5, 0, '/'))
                 .isInstanceOf(ArithmeticException.class);

        // HW1.3: Сравните одну и ту же проверку с использованием условий, ассертов, AssertJ
        // в каком случае стандартное сообщение об ошибке будет более информативным?
        // if (0 != seminars.first.Calculator.Calculator.calculation(2, 6, '+')) {
        //     throw new AssertionError("Ошибка в методе");
        // }
        //   assert 0 == seminars.first.Calculator.Calculator.calculation(2, 6, '+');
        assertThat(hw.first.Calculator.Calculator.calculation(2, 6, '+')).isEqualTo(8);

        // hw.first.1
        assertThatThrownBy(()->
                hw.first.Calculator.Calculator.calculatingDiscount(100, -100))
                .isInstanceOf(ArithmeticException.class);

        // hw.first.Calculator.Calculator.calculatingDiscount(100, -100);
    }
}