import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        testCalculateSimpleMultiplication();
        testCalculateAddition();
        testCalculateMixedOperations();
        testInvalidInput();
    }

    static void testCalculateSimpleMultiplication() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(2.0f, 3.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("*"));

        Calculator.Calculate(numbers, operations);
        float expected = 6.0f;
        float actual = Calculator.finalResult;

        System.out.println("Multiplication Test: " + (expected == actual ? "PASSED" : "FAILED"));
    }

    static void testCalculateAddition() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(10.0f, 5.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+"));

        Calculator.Calculate(numbers, operations);
        float expected = 15.0f;
        float actual = Calculator.finalResult;

        System.out.println("Addition Test: " + (expected == actual ? "PASSED" : "FAILED"));
    }

    static void testCalculateMixedOperations() {
        String result = Calculator.Run("2+3*4");
        String expected = "14.0";

        System.out.println("Mixed Operation Test: " + (expected.equals(result) ? "PASSED" : "FAILED"));
    }

    static void testInvalidInput() {
        String result = Calculator.Run("5+abc");
        String expected = "ERROR";

        System.out.println("Invalid Input Test: " + (expected.equals(result) ? "PASSED" : "FAILED"));
    }
}
