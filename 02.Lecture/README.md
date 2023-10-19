# Знакомство с тестовыми фреймворками


API (аббр. от англ. Application Programming Interface) — описание способов
взаимодействия одной компьютерной программы с другими.

Обратная совместимость — наличие в новой версии компьютерной программы
или компьютерного оборудования интерфейса, присутствующего в старой
версии, в результате чего другие программы (или человек) могут продолжать
работать с новой версией без значительной переделки.

## Юнит-тесты

Юнит-тесты обладают тремя атрибутами:

1. Проверка небольшого фрагмента кода (юнита или модуля). Фрагмент кода может быть проверяемый метод, класс или модуль.
2. Юнит-тест должен быстро тестировать.
3. Изоляция от другого кода. Зависимости в тестовом коде заменяются на тестовые заглушки — моки.

**Моки** — объекты-имитаторы, которые реализуют поведение реальной подсистемы. Моки используются как замена зависимостей.

Таблица подходов (школ) к пониманию изоляции кода:

<table>
<tr><th></th><th>Изоляция</th><th>Единица кода (юнит)</th><th>Что изолируется</th></tr>
<tr><td>Лондонская школа</td><td>Юнитов</td><td>Класс</td><td>Любые другие классы</td></tr>
<tr><td>Классическая школа</td><td>Юнит-тестов</td><td>Класс или набор классов</td><td>Уже связанные с другими классами классы</td></tr>
</table>

На 1 строку рабочего кода в среднем приходится 2-3 строки. Используются
принципы KISS, DRY:

- **KISS** (Keep It Simple Stupid) — не усложняй!
- **DRY** (Don’t Repeat Youself) — не повторяйся
- **DIE** — Duplication Is Evil.

## Интеграционные тесты

Интеграционные тесты выполняются QA-отделом

Интеграционное тестирование проверяет насколько хорошо тот или иной юнит способен взаимодействовать с внешним миром не ломая его, позволяет понять действительно ли API юнитов подходят друг другу (ближайшему окружению).


Границы между unit и интеграционным тестированием всегда размыты, но характеристики интеграционного теста следующие:
- использует базу данных;
- использует сеть;
- использует внешнюю систему (почтовая служба и др.);
- выполняет операции ввода-вывода;
- больше полагается (использует) бинарник, а не исходник.

### Пирамида автоматизации Майка Кона

<img src=pics/piramid.png>

Ширина каждого уровня пирамиды показывает, сколько тестов должно быть на каждом уровне по сравнению с другими. Чем выше уровень, тем меньше нужно тестов. Юнит-тесты самые быстрые и самые дешёвые для бизнеса.

## Тестовые Фреймворки

Фреймворки для модульного (юнит) тестирования предоставляют предварительно написанный код (шаблон), в который нужно только подставить свои значения.

Преимущества фреймворков:

1. Простой процесс диагностики и отладки.
2. Повышенная эффективность кода.
3. Ускоренная разработка.

Широко используемые фреймворки:

- Mockito
- JBehave
- Spock
- TestNG
- JUnit

### JUnit

JUnit является одним из наиболее широко распространённых фреймворков модульного тестирования с открытым исходным кодом. На его основе создан TestNG, Spock. Созданный Кентом Беком и Эриком Гаммой, JUnit входит в семейство фреймворков xUnit:
- JUnit - Java
- NUnit - .NET
- PHPUnit - PHP
- PyUnit - Python
- fUnit - Fortran
- DUnit - Delphi 
- FPCUnit - Free Pascal
- Test::Unit - Perl 
- CppUnit - C++ 
- FlexUnit - Flex 
- JSUnit - JavaScript 
- COSUnit - COS 

JUnit породил экосистему расширений — jMock, EasyMock, DbUnit, HttpUnit и т. д.

### Семейство xUnit

Принципы семейства xUnit:

1. Test runner(Средство выполнения тестов) — это исполняемая программа, которая запускает тесты
2. Test case (Тестовый пример) — это класс, от которого мы хотим наследоваться, если пишем свой тест.
3. Test fixtures (Тестовые инструменты) — это набор предварительных условий или состояний
4. Test suites (Наборы тестов) — позволяет упаковать много тестов
5. Test execution (Выполнение теста) — это выполнение отдельного теста
6. Test result formatter — модуль форматирования результатов теста и их анализ.
7. Assertions (Утверждения) — уже знакомые нам по принципу проверки.

## Фреймворки для тестирования Java

<table>
 <tr>
  <th>Name</th>
  <th><a href="https://en.wikipedia.org/wiki/XUnit">xUnit</a>
  </th>
  <th>Remarks</th>
 </tr>
 <tr>
  <td>Agitar</td>
  <td>Yes</td>
  <td>Automates
   creation of thorough JUnit tests in code
  </td>
 </tr>
 <tr>
  <td>Artos
  </td>
  <td>Yes
  </td>
  <td>Open
   source framework for writing Unit, Integration and functional
   tests. It includes pre-configured logging framework and extent
   reports, utilities to write flow for manual/semi-automated
   testing. It supports BDD testing using cucumber scripts.
     </td>
 </tr>
 <tr>
  <td>Arquillian
  </td>
  <td>Yes
  </td>
  <td>Open
   source framework for writing Integration and functional tests. It
   includes Arquillian graphene, Drone and Selenium to write tests to
   the visual layer too.
     </td>
 </tr>
 <tr>
  <td>AssertJ
  </td>
  <td>
     </td>
  <td>Fluent
   assertions for java
  </td>
 </tr>
 <tr>
  <td>beanSpec
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>
  </td>
 </tr>
 <tr>
  <td>BeanTest
  </td>
  <td>No
  </td>
  <td>A
   tiny Java web test framework built to use WebDriver/HTMLUnit
   within BeanShell scripts
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/Jakarta_Cactus">Cactus</a>
  </td>
  <td>
     </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   for testing <a href="https://en.wikipedia.org/wiki/Java_EE">Java
   EE</a> and web applications. Cactus tests are executed inside the
   <a href="https://en.wikipedia.org/wiki/Java_EE">Java EE</a>/web
   container.
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/Concordion">Concordion</a>
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Acceptance_test-driven_development">Acceptance
   test-driven development</a>, <a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>, <a href="https://en.wikipedia.org/wiki/Specification_by_example">Specification
   by example</a>
  </td>
 </tr>
 <tr>
  <td>Concutest
  </td>
  <td>
     </td>
  <td>A
   framework for testing concurrent programs
  </td>
 </tr>
 <tr>
  <td>Cucumber-JVM
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a> replaces deprecated <a href="https://en.wikipedia.org/wiki/JRuby">JRuby</a>-based
   Cuke4Duke
  </td>
 </tr>
 <tr>
  <td>Cuppa
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a> framework for Java 8
 </tr>
 <tr>
  <td>DbUnit
  </td>
  <td>
     </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   to perform unit testing with database-driven programs
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/EasyMock">EasyMock</a>
  </td>
  <td>
     </td>
  <td><a name="cite_ref-13"></a>A
   mock framework<a href="#cite_note-13">[13]</a>
  </td>
 </tr>
 <tr>
  <td>EtlUnit
  </td>
  <td>Yes
  </td>
  <td><a name="cite_ref-15"></a>A
   unit testing framework for Extract-Transform-Load processes,
   written in Java. Capable of testing Oracle, Informatica,
   SqlServer, PostGreSQL, MySQL, etc.<a href="#cite_note-15">[15]</a>
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/EvoSuite">EvoSuite</a>
  </td>
  <td>
     </td>
  <td>A
   test case generation tool that can automatically generate JUnit
   tests.
  </td>
 </tr>
 <tr>
  <td>GrandTestAuto
  </td>
  <td>
     </td>
  <td>GrandTestAuto
   (GTA) is a platform for the complete automated testing of Java
   software. Tests can be distributed across a number of machines on
   a network.
  </td>
 </tr>
 <tr>
  <td>GroboUtils
  </td>
  <td>
     </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   providing automated documentation, class hierarchy unit testing,
   code coverage, and multi-threaded tests.
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/Hamcrest">Hamcrest</a>
  </td>
  <td>
     </td>
  <td>Creating
   customized assertion matchers that can be used together with unit
   testing frameworks
  </td>
 </tr>
 <tr>
  <td>HavaRunner
  </td>
  <td>Yes
  </td>
  <td>A
   JUnit runner with built-in concurrency support, suites and
   scenarios.
  </td>
 </tr>
 <tr>
  <td>Instinct
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>
  </td>
 </tr>
 <tr>
  <td>Java
   Server-Side Testing framework (JSST)
  </td>
  <td>
     </td>
  <td>Java
   Server-Side Testing framework which is based on the similar idea
   to the one of Apache CACTUS, but unlike CACTUS it's not coupled to
   JUnit 3.x and can be used in conjunction with any testing
   framework.
  </td>
 </tr>
 <tr>
  <td>JBehave
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>
  </td>
 </tr>
 <tr>
  <td>JDave
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>
  </td>
 </tr>
 <tr>
  <td>JExample
  </td>
  <td>Yes
  </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   that uses dependencies between test cases to reduce <a href="https://en.wikipedia.org/wiki/Code_duplication">code
   duplication</a> and improves defect localization.
  </td>
 </tr>
 <tr>
  <td>JGiven
  </td>
  <td>
     </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a>
  </td>
 </tr>
 <tr>
  <td>JMock
  </td>
  <td>
     </td>
  <td>A
   mock framework
     </td>
 </tr>
 <tr>
  <td>JMockit
  </td>
  <td>
     </td>
  <td>Open
   source framework. Tests can easily be written that will mock final
   classes, static methods, constructors, and so on. There are no
   limitations.
  </td>
 </tr>
 <tr>
  <td>Jnario
  </td>
  <td>Yes
  </td>
  <td><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
   development</a> like <a href="https://en.wikipedia.org/wiki/Cucumber_(software)">Cucumber</a>
  </td>
 </tr>
 <tr>
  <td>jqwik
  </td>
  <td>
     </td>
  <td>JUnit
   5 test engine for Property-based Testing
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/Jtest">Jtest</a>
  </td>
  <td>Yes
  </td>
  <td>Commercial.
   Automated unit/component test generation and execution with code
   coverage and runtime error detection. Also provides static
   analysis and peer code review.
  </td>
 </tr>
 <tr>
  <td>Jukito
  </td>
  <td>
     </td>
  <td>Combines
   <a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a> and
   <a href="https://en.wikipedia.org/wiki/Guice">Guice</a> to allow
   automatic mocking and instantiation of dependencie
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
  </td>
  <td>Yes
  </td>
  <td>
     </td>
 </tr>
 <tr>
  <td>JUnitEE
  </td>
  <td>
     </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   for testing <a href="https://en.wikipedia.org/wiki/Java_EE">Java
   EE</a> applications
     </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/JWalk">JWalk</a>
  </td>
  <td>
     </td>
  <td>Fast,
   semi-automatic creation of exhaustive unit test-sets
  </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a>
  </td>
  <td>
     </td>
  <td>A
   mock framework, using the <a href="https://github.com/hamcrest">[1]</a>
   library
     </td>
 </tr>
 <tr>
  <td>Mockrunner
  </td>
  <td>
     </td>
  <td>A
   <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a> extension
   for testing testing servlets, filters, tag classes and Struts
   actions and forms.
     </td>
 </tr>
 <tr>
  <td>Needle
  </td>
  <td>
     </td>
  <td>Open
   source framework for testing Java EE components outside of the
   container in isolation.
     </td>
 </tr>
 <tr>
  <td>NUTester
  </td>
  <td>
     </td>
  <td>Testing
   framework developed at Northeastern University to aid in teaching
   introductory computer science courses in Java
  </td>
 </tr>
 <tr>
  <td>OpenPojo
  </td>
  <td>
     </td>
  <td>Open
   source framework used to validate and enforce POJO behavior as
   well as manage identity - equals, hashCode &amp; toString.
     </td>
 </tr>
 <tr>
  <td>PowerMock
  </td>
  <td>
     </td>
  <td>An
   extension to both <a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a>
   and EasyMock that allows mocking of static methods, constructors,
   final classes and methods, private methods, removal of static
   initializers and more.
     </td>
 </tr>
 <tr>
  <td>Randoop
  </td>
  <td>Yes
  </td>
  <td>Automatically
   finds bugs and generates unit tests for Java, via
   feedback-directed random testing (a variant of <a href="https://en.wikipedia.org/wiki/Fuzzing">Fuzzing</a>).
   </span>
     </td>
 </tr>
 <tr>
  <td>Spock
   </span>
     </td>
  <td>
     </td>
  <td>Spock
   is a testing and specification framework for Java and Groovy
   applications. Spock supports specification by example and BDD
   style testing.
     </td>
 </tr>
 <tr>
  <td>SpryTest
  </td>
  <td>Yes
  </td>
  <td>Commercial.
   Automated Unit Testing Framework for Java
     </td>
 </tr>
 <tr>
  <td>SureAssert
  </td>
  <td>
     </td>
  <td>An
   integrated Java unit testing solution for Eclipse. Contract-First
   Design and test-driven development
     </td>
 </tr>
 <tr>
  <td>Tacinga
   </span>
     </td>
  <td>
     </td>
  <td>Uses
   a pure Object-Oriented Programming approach and offers a
   commercial license and free support.
     </td>
 </tr>
 <tr>
  <td><a href="https://en.wikipedia.org/wiki/TestNG">TestNG</a>
  </td>
  <td>Yes
  </td>
  <td><a name="cite_ref-48"></a><a name="cite_ref-49"></a>Tests
   can include unit tests, functional tests, and integration tests.
   Has facilities to create even non-functional tests (as loading
   tests, timed tests).<a href="#cite_note-48">[48]</a><a href="#cite_note-49">[49]</a>
   </span>
     </td>
 </tr>
 <tr>
  <td>Unitils
  </td>
  <td>
     </td>
  <td>Offers
   general utilities and features for helping with persistence layer
   testing and testing with mock objects. Offers specific support for
   testing application code that makes use of JPA, hibernate and
   spring. Unitils integrates with the test frameworks JUnit and
   TestNG.
     </td>
 </tr>
 <tr>
  <td>XMLUnit
  </td>
  <td>
     </td>
  <td>JUnit
   and NUnit testing for XML
     </td>
 </tr>
</table>

## JUnit 5

JUnit 5 можно разделить на 3 различных проекта: 

1. JUnit Platform
2. Jupiter
3. Vintage

<img src=pics/junit.png>

- **JUnit Platform**, разработчик не взаимодействует напрямую с ядром фреймворка, для этого предоставлено API (Jupiter).
- **Vintage** — ещё один API, но для старых версий JUnit, он обеспечивает обратную совместимость со старыми версиями, т. е. можно безболезненно перейти со старой версии и не обязательно будет переписывать старые тесты, они могут
работать все одновременно в одном проекте.
- **Third party** - Можно писать своё API , которое будет обращаться к тестовому движку.
- **Build tools** (Maven, gradle) — это системы сборки проектов, которые берут на себя настройку зависимостей, скачивание библиотек, автоматизацию процессов тестирования.

### JUnit 5 Asserts (устарел)

junit.framework.Assert
- assertEquals
- assertFalse
- assertNotNull
- assertNull
- assertNotSame
- assertSame
- assertTrue

Синтаксис JUnit Assert похож на AssertJ:
```
public class MathTest {
    @Test
    public void testEquals() {
        Assert.assertEquals(4, 2 + 2);
        Assert.assertTrue(4 == 2 + 2);
    }
    @Test
    public void testNotEquals() {
        Assert.assertFalse(5 == 2 + 2);
    }
}
```

### Установка JUnit 5

1. [junit-jupiter-api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.1)
2. [junit-platform-commons](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-commons/1.9.1)
3. import org.junit.jupiter.api.*;

### Тестовый и рабочий код

Прежде чем приступить к написанию тестов, нужно настроить корневой каталог для тестов. Корневой каталог Test Sources — это папка, в которой хранится ваш тестовый код. В окне Project tool эта папка отмечена зеленым значком. В этих папках код, относящийся к тестированию, хранится отдельно от рабочего кода.

Настроить тестовую папку можно следующим образом:

1. Создадим директорию Test.
2. Разметим её, как каталог для тестов, для этого перейдём в настройки проекта (IDEA: File → Project Structure — вкладка Sources) и отметим папку Test как Tests, папка должна стать зелёной.
3. Перенесём старый тестовый класс CalculationTest в новую Test Sources.

Перепишем тестовый класс, с использованием JUnit 5:

```
import org.junit.jupiter.api.Test;
import ru.gb.units.Calculator;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculationTest {
    @Test
    void additionExpressionEvaluation() {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,6,'+')).isEqualTo(8);
    }
    @Test
    void subtractionExpressionEvaluation () {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,2,'-')).isEqualTo(0);
    }
    @Test
    void multiplicationExpressionEvaluation () {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(2,7,'*')).isEqualTo(14);
    }
    @Test
    void divisionExpressionEvaluation () {
        Calculator calculator = new Calculator();
        assertThat(calculator.calculation(100,90,'/')).isEqualTo(2);
    }
    @Test
    void expectedIllegalStateExceptionOnInvalidOperatorSymbol () {
        Calculator calculator = new Calculator();
        assertThatThrownBy(() ->
        calculator.calculation(8,4,'_'))
        .isInstanceOf(IllegalStateException.class);
    }
}
```

### @Test
Аннотация (декоратор) @Test в JUnit 5 используется для указания того, что аннотированный метод является методом тестирования. Находится аннотация в пакете junit.jupiter.api. 

Вот ее исходный код:

```
package org.junit.jupiter.api;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;
import org.apiguardian.api.API.Status;
import org.junit.platform.commons.annotation.Testable;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(
    status = Status.STABLE,
    since = "5.0"
)
@Testable
public @interface Test {
}
```

### Допишем класс Calculator

В main вызов методов getOperator() и getOperand(), с их помощью мы будем
запрашивать и получать от пользователя значения для вычисления.

```
package ru.geekbrains;
import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Результат операции: " + result);
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
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalStateException("Unexpected Operator");
        }
        return result;
    }
    public static char getOperator() {
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }
    public static int getOperand() {
        System.out.println("Введите число:");
        int operand = scanner.nextInt();
        return operand;
    }
}
```

### Тестируем новые функции

В случае, когда в метод getOperand() передаётся не цифра возникает ошибка IllegalStateException: Unexpected Operator.

Исправим этот метод:

```
package ru.geekbrains;
import java.util.Scanner;

public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
        int firstOperand = getOperand();
        int secondOperand = getOperand();
        char operator = getOperator();
        int result = calculation(firstOperand, secondOperand, operator);
        System.out.println("Результат операции: " + result);
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
                    throw new ArithmeticException("Division by zero");
                }
            default:
                throw new IllegalStateException("Unexpected Operator");
        }
        return result;
    }
    public static char getOperator() {
        System.out.println("Введите операцию:");
        char operation = scanner.next().charAt(0);
        return operation;
    }
    public static int getOperand() {
        System.out.println("Введите число:");
        int operand;
        if (scanner.hasNextInt()) {
            operand = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз");
        if (scanner.hasNext()) {
            scanner.next();
            operand = getOperand();
        } else {
            throw new IllegalStateException("Ошибка в вводимых данных");
            }
        }
        return operand;
    }
}
```

И напишем соответствующие тесты:
1. Для случая, когда в метод передаётся корректное значение:
- getOperandCompletesCorrectlyWithNumbers

В этом случаем мы ожидаем завершение без ошибок.

2. Для случая, когда в метод передается некорректное значение:
- getOperandCompletesCorrectlyWithNotNumbers

В этом случаем мы хотим увидеть ожидаемое исключение.

Метод getOperand работает со сканером, и должен корректно принимать цифры. Для теста мы должны имитировать ввод пользователем значений. Это делается с помощью System.setIn(...):

```
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gb.units.Calculator;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculationTest {
...
@Test
void getOperandCompletesCorrectlyWithNumbers() {
String testedValue = "9"; // Значение для тестов
ByteArrayInputStream in = new
ByteArrayInputStream(testedValue.getBytes());
InputStream inputStream = System.in; // Сохраняем ссылку
на ввод с клавиатуры
System.setIn(in); // Подменяем ввод
Calculator.getOperand(); // Вызываем метод
System.out.println(testedValue); // Для наглядности
вывода
System.setIn(inputStream); // Подменяем обратно
}
}
@Test
void getOperandCompletesCorrectlyWithNotNumbers() {
String testedValue = "k";
ByteArrayInputStream in = new
ByteArrayInputStream(testedValue.getBytes());
ByteArrayOutputStream out = new ByteArrayOutputStream();
InputStream inputStream = System.in;
System.setIn(in);
System.setOut(new PrintStream(out));
assertThatThrownBy(() -> Calculator.getOperand())
.isInstanceOf(IllegalStateException.class).describedAs("Ошибка
в вводимых данных");
System.setIn(inputStream);
System.setOut(null);
}
```

## Аннотации
Рассмотрим некоторые важные аннотации в JUnit 5 Jupiter API. Большинство из
них находятся в пакете org.junit.jupiter.api в модуле junit-jupiter-api.
### @BeforeEach
Означает, что аннотированный метод должен выполняться перед каждым
методом @Test, @RepeatedTest, @ParameterizedTest или @TestFactory в текущем
классе.

```
@BeforeEach
public void initEach(){
//test setup code
}
```

### @AfterEach
Означает, что аннотированный метод должен выполняться после каждого метода
@Test, @RepeatedTest, @ParameterizedTest или @TestFactory в текущем классе.

```
@AfterEach
public void cleanUpEach(){
//Test cleanup code
}
```

### @BeforeAll
Означает, что аннотированный метод должен выполняться перед всеми методами @Test, @RepeatedTest, @ParameterizedTest и @TestFactory в текущем классе; аналогично @BeforeClass в JUnit 4. Такие методы должны быть статическими, если не используется жизненный цикл тестового экземпляра «для каждого класса».

```
@BeforeAll
public static void init(){
System.out.println("BeforeAll init() method called");
}
```

### @AfterAll
Означает, что аннотированный метод должен выполняться после всех методов
@Test, @RepeatedTest, @ParameterizedTest и @TestFactory в текущем классе.
Такие методы должны быть статическими, если не используется жизненный цикл
экземпляра теста «для каждого класса».

```
@AfterAll
public static void cleanUp(){
System.out.println("After All cleanUp() method called");
}
```

### @DisplayName
Объявляет пользовательское отображаемое имя для тестового класса или
тестового метода.

```
@Test
@DisplayName("╯°□°)╯")
void testWithDisplayNameContainingSpecialCharacters() {
}
```

### @Disable
Используется для отключения тестового класса или тестового метода;

```
@Disabled("Disabled until bug #42 has been resolved")
@Test
void testWillBeSkipped() {
}
```

### @RepeatedTest
Означает, что метод является шаблоном теста для повторного тестирования.

```
@RepeatedTest(10)
void repeatedTest() {
// ...
}
```

### @ParameterizedTest
Означает, что метод является параметризованным тестом.

```
@ParameterizedTest
@ValueSource(strings = { "racecar", "radar", "able was I ere I
saw elba" })
void palindromes(String candidate) {
assertTrue(StringUtils.isPalindrome(candidate));
}
```