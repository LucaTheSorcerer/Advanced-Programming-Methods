package Ex4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.tstUtils;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestEx4 {

    private static final String TEST_ONE = "Find cheapest keyboard";
    private static final String TEST_TWO = "Find most expensive product";
    private static final String TEST_THREE = "Multiplication of number in array with integer";
    private static final String TEST_FOUR = "Division of number in array with integer";

    @BeforeEach
    public void setUp() {
        Ex4 ex4 = new Ex4();
        tstUtils tstUtils = new tstUtils();
    }

    @Test
    public void testFindCheapestKeyboard() {
        int[] keyboards = {40, 50, 60};
        int expected = 40;

        int result = Ex4.findCheapestKeyboard(keyboards);

        try {
            Assertions.assertEquals(expected, result);
            tstUtils.testLogger(TEST_ONE, tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            tstUtils.testLogger(TEST_ONE, tstUtils.FAILED);
        }
    }

    @Test
    public void testfindCheapestKeyboardFail() {
        int[] keyboards = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex4.findCheapestKeyboard(keyboards));


    }

    @Test
    public void testFindMostExpensiveProduct() {
        int[] keyboard = {120, 40, 66};
        int[] drives = {15, 89, 25};
        int expected = 120;

        int result = Ex4.findMostExpensiveItem(keyboard,drives);

        try {
            Assertions.assertEquals(expected, result);
            tstUtils.testLogger(TEST_TWO, tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            tstUtils.testLogger(TEST_TWO, tstUtils.FAILED);
        }
    }

    @Test
    public void testFindMostExpensiveProductFail() {
        int[] keyboard = {};
        int[] drives = {};

        assertThrows(IllegalArgumentException.class, ()-> Ex4.findMostExpensiveItem(keyboard,drives));
    }

    @Test
    public void testFindMostExpensiveDrive() {
        int[] drives = {15, 45, 20};
        int budget = 30;
        int expected = 20;

        int result = Ex4.findMostExpensiveDrives(drives,budget);

        try {
            Assertions.assertEquals(expected, result);
            tstUtils.testLogger(TEST_THREE, tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            tstUtils.testLogger(TEST_THREE, tstUtils.FAILED);
        }
    }

    @Test
    public void testFindMostExpensiveDriveFail() {

        int[] drives = {};
        int budget = 20;
        assertThrows(IllegalArgumentException.class, ()-> Ex4.findMostExpensiveDrives(drives, budget));

    }

    @Test
    public void testBudget() {
        int[] keyboards = {40, 50, 60};
        int[] usbDrives = {8, 12};
        int budget = 60;
        int expected = 58;

        int result = Ex4.calculateTotalCost(budget,keyboards,usbDrives);

        try {
            Assertions.assertEquals(expected, result);
            tstUtils.testLogger(TEST_FOUR, tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            tstUtils.testLogger(TEST_FOUR, tstUtils.FAILED);
        }
    }

    @Test
    public void testBudgetFail() {
        int[] keyboards = {};
        int[] usbDrives = {};
        int budget = 60;

        assertThrows(IllegalArgumentException.class, ()-> Ex4.calculateTotalCost(budget,keyboards,usbDrives));
    }


}
