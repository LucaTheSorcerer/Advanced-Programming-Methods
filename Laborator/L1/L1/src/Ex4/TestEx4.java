package Ex4;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.tstUtils;

public class TestEx4 {

    private static final String TEST_ONE = "Find cheapest keyboard";
    private static final String TEST_TWO = "Find most expensive product";
    private static final String TEST_THREE = "Multiplication of number in array with integer";
    private static final String TEST_FOUR = "Division of number in array with integer";

    private Ex4 ex4;

    @BeforeEach
    public void setUp() {
        ex4 = new Ex4();
    }

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

    @Test
    public void testfindMostExpensiveProduct() {
        int[] keyboard = {120, 40, 66};
        int[] drives = {15, 89, 25};
        int expected = 120;

        int result = Ex4.findMostExpensiveItem(keyboard,drives);
        Assertions.assertEquals(expected, result);
        if(result == expected) {
            tstUtils.testLogger(TEST_TWO, tstUtils.SUCCESSFUL);
        } else {
            tstUtils.testLogger(TEST_TWO, tstUtils.FAILED);
        }
    }

    @Test
    public void testFindMostExpensiveDrive() {
        int[] drives = {15, 45, 20};
        int budget = 30;
        int expected = 20;

        int result = Ex4.findMostExpensiveDrives(drives,budget);
        Assertions.assertEquals(expected, result);
        if(result == expected) {
            tstUtils.testLogger(TEST_THREE, tstUtils.SUCCESSFUL);
        } else {
            tstUtils.testLogger(TEST_THREE, tstUtils.FAILED);
        }
    }

    @Test
    public void testBudget() {
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 60;
        int expected = 58;

        int result = Ex4.calculateTotalCost(budget,keyboards,usbDrives);

        Assertions.assertEquals(expected, result);
        if(result == expected) {
            tstUtils.testLogger(TEST_FOUR, tstUtils.SUCCESSFUL);
        } else {
            tstUtils.testLogger(TEST_FOUR, tstUtils.FAILED);
        }
    }



}
