import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.calculator.Calculator;

public class CalculatorTest {
    Calculator calculator;
    
    @BeforeEach
    void initMethodSetUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple Addition")
    void testAddition() {
        assertEquals("4.0", Calculator.addition(2, 2));
    }

    @Test
    @DisplayName("Simple Subtraction")
    void testSubtraction() {
        assertEquals("1.0", Calculator.subtraction(3, 2));
    }

    @Test
    @DisplayName("Simple Multiplication")
    void testMultiplication() {
        assertEquals("12.0", Calculator.multiplication(3, 4));
    }

    @Test
    @DisplayName("Simple Division")
    void testDivision() {
        assertEquals("2.0", Calculator.division(56, 28));
    }

    @Test
    @DisplayName("Division By Zero")
    void testDivisionByZero() {
        assertEquals("Infinity", Calculator.division(4,0));
    }

    @Test
    @DisplayName("Square Root")
    void testSquareRoots() {
        assertEquals("2.0", Calculator.squareRoot(4));
    }

    @Test
    @DisplayName("Square Root of Negative Number")
    void testSquareRootsOfNegatives() {
        assertEquals("2.0i", Calculator.squareRoot(-4));
    }

    @Test
    @DisplayName("Natural Logarithm")
    void testNaturalLogarithms() {
        assertEquals("0.0", Calculator.naturalLog(1));
    }

    @Test
    @DisplayName("Natural Logarithm of Negative Number")
    void testNaturalLogarithmsOfNegatives() {
        assertEquals("Logarithm of this number does not exist", Calculator.naturalLog(-3));
    }

    @Test
    @DisplayName("Simple Factorials")
    void testFactorial() {
        assertEquals("120", Calculator.factorial(5));
    }

    @Test
    @DisplayName("Factorial of Negative Number does not exist")
    void testFactorialNegatives() {
        assertEquals("Factorial of Negative Number does not exist", Calculator.factorial(-3));
    }

    @Test
    @DisplayName("Factorial of Zero")
    void testFactorialZero() {
        assertEquals("1", Calculator.factorial(0));
    }

    @Test
    @DisplayName("Simple Powers")
    void testPower() {
        assertEquals("32.0", Calculator.power(2, 5));
    }

    @Test
    @DisplayName("Power Zero")
    void testPowerZero() {
        assertEquals("1.0", Calculator.power(5, 0));
    }

}
