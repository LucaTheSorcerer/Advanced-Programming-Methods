package Ex3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestEx3 {

    private static final String TEST_ONE = "Sum of numbers in arrays";
    private static final String TEST_TWO = "Difference of numbers in arrays";
    private static final String TEST_THREE = "Multiplication of number in array with integer";
    private static final String TEST_FOUR = "Division of number in array with integer";


    private static final String SUCCESSFUL = "was successful";
    private static final String FAILED = "has failed";

    private Ex3 ex3;

    @BeforeEach
    public void setUp() {
        ex3 = new Ex3();
    }

    @Test
    public void testAddition() {
        int[] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedResult = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] result = Ex3.sum(number1, number2);

        printAssertionResult(expectedResult, result, TEST_ONE);
    }

    @Test
    public void testSubtraction() {
        int[] number1 = {8, 3, 0, 0, 0, 0, 0};
        int[] number2 = {5, 4, 0, 0, 0, 0, 0};

        int[] expectedResult = {2, 9, 0, 0, 0, 0, 0};

        int[] result = Ex3.subtract(number1, number2);

        printAssertionResult(expectedResult, result, TEST_TWO);
    }

    private void printAssertionResult(int[] expectedResult, int[] result, String testTwo) {
        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Expected: " + Arrays.toString(expectedResult));

        Assertions.assertArrayEquals(expectedResult, result);

        if(Arrays.equals(expectedResult, result)) {
            testLogger(testTwo, SUCCESSFUL);
        } else {
            testLogger(testTwo, FAILED);
        }
    }




    private static void testLogger(String testName, String result) {
        System.out.println("Test: " + testName + " " + result);
    }

}
