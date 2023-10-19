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

<table width="680" cellpadding="4" cellspacing="0" style="page-break-inside: auto">
 <tr>
  <td width="134">Name</td>
  <td width="64"><a href="https://en.wikipedia.org/wiki/XUnit">xUnit</a>
  </td>
  <td width="456">Remarks</td>
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
