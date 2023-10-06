package Ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestEx2 {

    private static final String TEST_ONE = "Biggest Number";
    private static final String TEST_TWO = "Smallest Number";
    private static final String TEST_THREE = "Maximum n-1 Sum";
    private static final String TEST_FOUR = "Minimum n-1 Sum";


    private static final String SUCCESFULL = "was succesfull";
    private static final String FAILED = "has failed";

    private Ex2 ex2;

    @BeforeEach
    public void setUp() {
        ex2 = new Ex2();
    }

    @Test
    public void testFindBiggestNr() {
        int[] arr = {1, 2, -3, 4, 5, 124};
        int expected = 124;
        int result = ex2.returnMaxNumber(arr);
        assertEquals(expected, result);
        if(result == expected) {
            testLogger(TEST_ONE, SUCCESFULL);
        } else {
            testLogger(TEST_ONE, FAILED);
        }
    }

    @Test
    public void testFindMinNumber() {
        int[] arr = {1, 2, -3, 4, 5, 124};
        int expected = -3;
        int result = ex2.returnMinNumber(arr);
        assertEquals(expected, result);
        if(result == expected) {
            testLogger(TEST_TWO, SUCCESFULL);
        } else {
            testLogger(TEST_TWO, FAILED);
        }
    }

    @Test
    public void testMaxSum() {
        int[] arr = {4, -1, 3};
        int expected = 7;
        int result = ex2.returnMaxSum(arr);
        assertEquals(expected, result);
        if(result == expected) {
            testLogger(TEST_THREE, SUCCESFULL);
        } else {
            testLogger(TEST_THREE, FAILED);
        }
    }

    @Test
    public void testMinSum() {
        int[] arr = {4, -1, 3};
        int expected = 2;
        int result = ex2.returnMinSum(arr);
        assertEquals(expected, result);
        if(result == expected) {
            testLogger(TEST_FOUR, SUCCESFULL);
        } else {
            testLogger(TEST_FOUR, FAILED);
        }
    }


    private static void testLogger(String testName, String result) {
        System.out.println("Test: " + testName + " " + result);
    }
}
