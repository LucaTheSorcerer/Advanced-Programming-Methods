package Ex3;

import Ex2.Ex2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static utils.tstUtils.testLogger;


public class TestEx3 {

    private static final String TEST_ONE = "Sum of numbers in arrays";
    private static final String TEST_TWO = "Difference of numbers in arrays";
    private static final String TEST_THREE = "Multiplication of number in array with integer";
    private static final String TEST_FOUR = "Division of number in array with integer";


    @BeforeEach
    public void setUp() {
        Ex3 ex3 = new Ex3();
    }

    @Test
    public void testAddition() {
        int[] number1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] number2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};

        int[] expectedResult = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        try {
            int[] result = Ex3.sum(number1, number2);
            Assertions.assertEquals(expectedResult, result, TEST_ONE);
        } catch (AssertionError e) {
            testLogger(TEST_ONE, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testAdditionFail() {
        int[] number1 = {};
        int[] number2 = {};

        assertThrows(IllegalArgumentException.class, ()-> Ex3.sum(number1, number2));

    }

    @Test
    public void testSubtraction() {
        int[] number1 = {8, 3, 0, 0, 0, 0, 0};
        int[] number2 = {5, 4, 0, 0, 0, 0, 0};

        int[] expectedResult = {2, 9, 0, 0, 0, 0, 0};

        int[] result = Ex3.subtract(number1, number2);

        try {
            Assertions.assertEquals(expectedResult, result, TEST_TWO);
        } catch (AssertionError e) {
            testLogger(TEST_TWO, utils.tstUtils.FAILED);
        }
    }
    @Test
    public void testSubtractionFail() {

        int[] number1 = {};
        int[] number2 = {};

        assertThrows(IllegalArgumentException.class, ()-> Ex3.subtract(number1, number2));
    }

    @Test
    public void testMultiplication() {
        int[] number = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int integer = 2;

        int[] expectedResult = {4, 7, 2, 0, 0, 0, 0, 0, 0};

        int[] result = Ex3.multiply(number, integer);

        try {
            Assertions.assertEquals(expectedResult, result, TEST_THREE);
        } catch (AssertionError e) {
            testLogger(TEST_THREE, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testMultiplicationFail() {
        int[] number = {};
        int integer = 0;

        assertThrows(IllegalArgumentException.class, ()-> Ex3.multiply(number, integer));
    }

    @Test
    public void testDivision() {
        int[] number = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        int divisor = 2;

        int[] expectedResult = {1, 1, 8, 0, 0, 0, 0, 0, 0};

        int[] result = Ex3.divide(number, divisor);

        try {
            Assertions.assertEquals(expectedResult, result, TEST_FOUR);
        } catch (AssertionError e) {
            testLogger(TEST_FOUR, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testDivisionFail() {
        int[] number = {};
        int divisor = 0;

        assertThrows(IllegalArgumentException.class, ()-> Ex3.divide(number, divisor));
    }

}
