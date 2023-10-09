package Ex2;

import Ex1.Ex1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static utils.tstUtils.testLogger;

import utils.tstUtils;

public class TestEx2 {

    private static final String TEST_ONE = "Biggest Number";
    private static final String TEST_TWO = "Smallest Number";
    private static final String TEST_THREE = "Maximum n-1 Sum";
    private static final String TEST_FOUR = "Minimum n-1 Sum";


    private static final String FAILED = "has failed";

    private Ex2 ex2;
    private tstUtils tstUtils;

    @BeforeEach
    public void setUp() {
        ex2 = new Ex2();
    }

    @Test
    public void testFindBiggestNrFail() {

        //try catch assert
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex2.returnMaxNumber(arr));

    }

    @Test
    public void testFindBiggestNr() {

        int[] arr = { 1, 2, -3, 4, 5, 124};
        int expected = 124;
        int result = Ex2.returnMaxNumber(arr);
        Assertions.assertEquals(expected, result);

        try {
            Assertions.assertEquals(expected, result);
            testLogger(TEST_ONE, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            testLogger(TEST_ONE, utils.tstUtils.FAILED);
        }


    }

    @Test
    public void testFindMinNumber() {
        int[] arr = {1, 2, -3, 4, 5, 124};
        int expected = -3;
        int result = Ex2.returnMinNumber(arr);

        try {
            Assertions.assertEquals(expected, result);
            testLogger(TEST_TWO, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            testLogger(TEST_TWO, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testFindMinNumberFail() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex2.returnMinNumber(arr));

    }

    @Test
    public void testMaxSum() {
        int[] arr = {4, -1, 3};
        int expected = 7;
        int result = Ex2.returnMaxSum(arr);

        try {
            Assertions.assertEquals(expected, result);
            testLogger(TEST_THREE, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            testLogger(TEST_THREE, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testMaxSumFail() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex2.returnMaxSum(arr));


    }

    @Test
    public void testMinSum() {
        int[] arr = {4, -1, 3};
        int expected = 2;
        int result = Ex2.returnMinSum(arr);

        try {
            Assertions.assertEquals(expected, result);
            testLogger(TEST_FOUR, utils.tstUtils.SUCCESSFUL);
        } catch (AssertionError e) {
            testLogger(TEST_FOUR, utils.tstUtils.FAILED);
        }
    }

    @Test
    public void testMinSumFail() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, ()-> Ex2.returnMinSum(arr));


    }
}
