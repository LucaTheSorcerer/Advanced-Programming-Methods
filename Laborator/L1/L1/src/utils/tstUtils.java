package utils;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class tstUtils {

    public static final String SUCCESSFUL = "was successful";
    public static final String FAILED = "has failed";


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


    public static void testLogger(String testName, String result) {
        System.out.println("Test: " + testName + " " + result);
    }
}
