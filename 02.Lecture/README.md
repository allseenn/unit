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

<table width="680" cellpadding="2" cellspacing="0">
	<tbody>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Agitar</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-1">[1]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Automates
				creation of thorough JUnit tests in code 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Artos</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-2">[2]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Open source
				framework for writing Unit, Integration and functional tests. It
				includes pre-configured logging framework and extent reports,
				utilities to write flow for manual/semi-automated testing. It
				supports BDD testing using cucumber scripts. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Arquillian</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-3">[3]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Open source
				framework for writing Integration and functional tests. It
				includes Arquillian graphene, Drone and Selenium to write tests
				to the visual layer too. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>AssertJ</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-4">[4]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Fluent
				assertions for java 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>beanSpec</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-5">[5]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>BeanTest</p>
			</td>
			<td width="41" bgcolor="#ffc7c7" style="background: #ffc7c7; border: none; padding: 0cm"><p align="center">
				No</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-6">[6]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A tiny Java
				web test framework built to use WebDriver/HTMLUnit within
				BeanShell scripts 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Jakarta_Cactus">Cactus</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"></td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension for testing <a href="https://en.wikipedia.org/wiki/Java_EE">Java
				EE</a> and web applications. Cactus tests are executed inside the
				<a href="https://en.wikipedia.org/wiki/Java_EE">Java EE</a>/web
				container. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Concordion">Concordion</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-7">[7]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Acceptance_test-driven_development">Acceptance
				test-driven development</a>, <a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a>, <a href="https://en.wikipedia.org/wiki/Specification_by_example">Specification
				by example</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Concutest</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-8">[8]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A framework
				for testing concurrent programs 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Cucumber-JVM</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-9">[9]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> replaces deprecated <a href="https://en.wikipedia.org/wiki/JRuby">JRuby</a>-based
				Cuke4Duke 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Cuppa</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-10">[10]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> framework for Java 8 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>DbUnit</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-11">[11]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension to perform unit testing with database-driven programs 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/EasyMock">EasyMock</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-12">[12]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a name="cite_ref-13"></a>
				A mock framework<a href="#cite_note-13">[13]</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>EtlUnit</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-14">[14]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a name="cite_ref-15"></a>
				A unit testing framework for Extract-Transform-Load processes,
				written in Java. Capable of testing Oracle, Informatica,
				SqlServer, PostGreSQL, MySQL, etc.<a href="#cite_note-15">[15]</a>
								</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/EvoSuite">EvoSuite</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-16">[16]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A test case
				generation tool that can automatically generate JUnit tests. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>GrandTestAuto</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-17">[17]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>GrandTestAuto
				(GTA) is a platform for the complete automated testing of Java
				software. Tests can be distributed across a number of machines on
				a network. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>GroboUtils</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-18">[18]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension providing automated documentation, class hierarchy unit
				testing, code coverage, and multi-threaded tests. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Hamcrest">Hamcrest</a>
								</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-19">[19]</a>
								</p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Creating
				customized assertion matchers that can be used together with unit
				testing frameworks 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>HavaRunner</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-20">[20]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A JUnit
				runner with built-in concurrency support, suites and scenarios. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Instinct</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-21">[21]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Java
				Server-Side Testing framework (JSST)</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-22">[22]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Java
				Server-Side Testing framework which is based on the similar idea
				to the one of Apache CACTUS, but unlike CACTUS it's not coupled
				to JUnit 3.x and can be used in conjunction with any testing
				framework. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JBehave</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-23">[23]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JDave</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-24">[24]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JExample</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-25">[25]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension that uses dependencies between test cases to reduce
				<a href="https://en.wikipedia.org/wiki/Code_duplication">code
				duplication</a> and improves defect localization. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JGiven</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-26">[26]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JMock</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-27">[27]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A mock
				framework 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JMockit</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-28">[28]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Open source
				framework. Tests can easily be written that will mock final
				classes, static methods, constructors, and so on. There are no
				limitations. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Jnario</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-29">[29]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Behavior-driven_development">Behavior-driven
				development</a> like <a href="https://en.wikipedia.org/wiki/Cucumber_(software)">Cucumber</a>
								</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>jqwik</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-30">[30]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>JUnit 5 test
				engine for Property-based Testing 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Jtest">Jtest</a></p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-31">[31]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Commercial.
				Automated unit/component test generation and execution with code
				coverage and runtime error detection. Also provides static
				analysis and peer code review. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Jukito</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-32">[32]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Combines
				<a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a> and
				<a href="https://en.wikipedia.org/wiki/Guice">Guice</a> to allow
				automatic mocking and instantiation of dependencies 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a></p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-33">[33]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"></td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>JUnitEE</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-34">[34]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension for testing <a href="https://en.wikipedia.org/wiki/Java_EE">Java
				EE</a> applications 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/JWalk">JWalk</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-35">[35]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Fast,
				semi-automatic creation of exhaustive unit test-sets 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a></p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-36">[36]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A mock
				framework, using the <a href="https://github.com/hamcrest">[1]</a>
				library 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Mockrunner</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-37">[37]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>A <a href="https://en.wikipedia.org/wiki/JUnit">JUnit</a>
				extension for testing testing servlets, filters, tag classes and
				Struts actions and forms. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Needle</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-38">[38]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Open source
				framework for testing Java EE components outside of the container
				in isolation. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>NUTester</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-39">[39]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Testing
				framework developed at Northeastern University to aid in teaching
				introductory computer science courses in Java 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>OpenPojo</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-40">[40]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Open source
				framework used to validate and enforce POJO behavior as well as
				manage identity - equals, hashCode &amp; toString. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>PowerMock</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-41">[41]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>An extension
				to both <a href="https://en.wikipedia.org/wiki/Mockito">Mockito</a>
				and EasyMock that allows mocking of static methods, constructors,
				final classes and methods, private methods, removal of static
				initializers and more. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Randoop</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-42">[42]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Automatically
				finds bugs and generates unit tests for Java, via
				feedback-directed random testing (a variant of <a href="https://en.wikipedia.org/wiki/Fuzzing">Fuzzing</a>).
								</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Spock 
				</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-43">[43]</a>
								</p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Spock is a
				testing and specification framework for Java and Groovy
				applications. Spock supports specification by example and BDD
				style testing. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>SpryTest</p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-44">[44]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Commercial.
				Automated Unit Testing Framework for Java 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>SureAssert</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-45">[45]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>An
				integrated Java unit testing solution for Eclipse. Contract-First
				Design and test-driven development 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Tacinga 
				</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-46">[46]</a>
								</p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Uses a pure
				Object-Oriented Programming approach and offers a commercial
				license and free support. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p><a href="https://en.wikipedia.org/wiki/TestNG">TestNG</a></p>
			</td>
			<td width="41" bgcolor="#9eff9e" style="background: #9eff9e; border: none; padding: 0cm"><p align="center">
				Yes</p>
			</td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-47">[47]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p><a name="cite_ref-48"></a><a name="cite_ref-49"></a>
				Tests can include unit tests, functional tests, and integration
				tests. Has facilities to create even non-functional tests (as
				loading tests, timed tests).<a href="#cite_note-48">[48]</a><a href="#cite_note-49">[49]</a>
								</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>Unitils</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-50">[50]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>Offers
				general utilities and features for helping with persistence layer
				testing and testing with mock objects. Offers specific support
				for testing application code that makes use of JPA, hibernate and
				spring. Unitils integrates with the test frameworks JUnit and
				TestNG. 
				</p>
			</td>
		</tr>
		<tr>
			<td width="139" style="border: none; padding: 0cm"><p>XMLUnit</p>
			</td>
			<td width="41" style="border: none; padding: 0cm"></td>
			<td width="50" style="border: none; padding: 0cm"><p><a href="#cite_note-sourceforge.net1-51">[51]</a></p>
			</td>
			<td width="434" style="border: none; padding: 0cm"><p>JUnit and
				NUnit testing for XML 
				</p>
			</td>
		</tr>
	</tbody>
</table>
