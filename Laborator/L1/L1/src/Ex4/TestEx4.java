package Ex4;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import utils.tstUtils;

public class TestEx4 {

    private static final String TEST_ONE = "Find cheapest keyboard";
    private static final String TEST_TWO = "Find most expensive product";
    private static final String TEST_THREE = "Multiplication of number in array with integer";
    private static final String TEST_FOUR = "Division of number in array with integer";

    @Test
    public void testfindCheapestKeyboard() {
        int[] keyboards = {40, 50, 60};
        int expected = 40;

        int result = Ex4.findCheapestKeyboard(keyboards);
        Assertions.assertEquals(expected, result);
        if(result == expected) {
            tstUtils.testLogger(TEST_ONE, tstUtils.SUCCESSFUL);
        } else {
            tstUtils.testLogger(TEST_ONE, tstUtils.FAILED);
        }
    }





}
